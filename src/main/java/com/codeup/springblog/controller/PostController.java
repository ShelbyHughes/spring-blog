package com.codeup.springblog.controller;

import com.codeup.springblog.services.EmailService;
import com.codeup.springblog.model.Post;
import com.codeup.springblog.model.User;
import com.codeup.springblog.repositiories.PostRepo;
import com.codeup.springblog.repositiories.UserRepository;;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller
public class PostController {

    private PostRepo postDao;
    private UserRepository userDao;
    private final EmailService emailService;

    public PostController(PostRepo postDao, UserRepository userDao, EmailService emailService) {
        this.postDao = postDao;
        this.userDao = userDao;
        this.emailService = emailService;
    }

    @GetMapping("/posts")
    public String posts(Model model) {
        model.addAttribute("title", "View All Posts");
        List<Post> post = postDao.findAll();
        model.addAttribute("posts", post);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String post(Model model, @PathVariable long id, Principal principal) {
        model.addAttribute("title", "View Post");
        String userName = "";
        if(principal != null){
            userName = principal.getName();
        }
        Post post = postDao.findById(id);
        model.addAttribute("post", post);
        model.addAttribute("username", userName);
        return "posts/show";

    }

    @GetMapping("/posts/create")
    public String showCreateForm(Model model) {
        User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(loggedInUser != null) {
            model.addAttribute("post", new Post());
            return "posts/create";
        } else{
            return "redirect:/login";
        }
    }

    @PostMapping("/posts/create")
    public String postNewPost(@RequestParam String title, @RequestParam String body) {
        User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Post post = new Post(title, body, loggedInUser);
        postDao.save(post);
        emailService.prepareAndSend(post,"A new post has been created!", "You created a new post!");
        return "redirect:/posts";
    }

    @PostMapping("/posts/{id}/delete")
    public String delete(@PathVariable long id){
        User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(loggedInUser.getId() == postDao.getOne(id).getUser().getId()) {
            postDao.deleteById(id);
        }
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String editForm(@PathVariable long id, Model model) {
        User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (loggedInUser != null) {
            Post postToEdit = postDao.getOne(id);
            model.addAttribute("post", postToEdit);
            return "posts/edit";
        }else{
            return "redirect:/posts";
        }
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