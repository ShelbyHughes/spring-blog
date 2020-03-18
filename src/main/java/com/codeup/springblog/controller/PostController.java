package com.codeup.springblog.controller;

import com.codeup.springblog.model.Post;
import com.codeup.springblog.repositiories.PostRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {

    private PostRepo postDao;

    public PostController(PostRepo postDao){
        this.postDao = postDao;
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
        model.addAttribute("post", post);
        return "posts/show";

    }

    @GetMapping("/posts/save")
    @ResponseBody
    public String savePost(){
        Post newPost= new Post();
        newPost.setTitle("New post");
        newPost.setBody("Nonsense");
        postDao.save(newPost);
        return "Saving post";
    }

    @GetMapping("/posts/edit")
    @ResponseBody
    public String editPost(){
        Post post = postDao.getOne(1L);
        post.setTitle("Updated Title!");
        postDao.save(post);
        return "Updating post";
    }

    @PostMapping("/posts/{id}/delete")
    public String deletePost(@PathVariable long id){
        Post post = postDao.findById(id);
        postDao.delete(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/search")
    public String searchPost(Model model){
        Post post = postDao.findByTitle("foreground");
        model.addAttribute(post);
        return "posts/search";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createForm() {
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String create() {
        return "create a new post";
    }

}
