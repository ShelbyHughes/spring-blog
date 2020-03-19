
package com.codeup.springblog.controller;

import com.codeup.springblog.model.Post;
import com.codeup.springblog.model.User;
import com.codeup.springblog.repositiories.PostRepo;
import com.codeup.springblog.repositiories.UserRepository;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.model.IModel;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    private PostRepo postDao;
    private UserRepository userDao;

    public PostController(PostRepo postDao, UserRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
    }

    @GetMapping("/posts")
    public String posts(Model model) {
        model.addAttribute("title", "View All Posts");
        List<Post> post = postDao.findAll();
        model.addAttribute("posts", post);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String post(Model model, @PathVariable long id) {
        model.addAttribute("title", "View Post");
        Post post = postDao.findById(id);
        User user = userDao.findById(1L);
        model.addAttribute("post", post);
        model.addAttribute("user", user);
        return "posts/show";

    }

    @GetMapping("/posts/create")
    public String showCreateForm(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String postNewPost(@RequestParam String title, @RequestParam String body) {
        Post post = new Post(title, body, userDao.findById(1L));
        postDao.save(post);
        return "redirect:/posts";
    }

    @PostMapping("/posts/{id}/delete")
    public String delete(@PathVariable long id){
        postDao.deleteById(id);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String editForm(@PathVariable long id, Model model) {
        Post postToEdit = postDao.getOne(id);
        model.addAttribute("post", postToEdit);
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String updatePost(@PathVariable long id, @RequestParam String title, @RequestParam String body) {
        Post p = postDao.getOne(id);
        p.setTitle(title);
        p.setBody(body);
        postDao.save(p);
        return "redirect:/posts";
    }

    @GetMapping("/posts/search")
    public String searchPost(Model model){
        Post post = postDao.findByTitle("foreground");
        model.addAttribute(post);
        return "posts/search";
    }


}