package com.codeup.springblog.controller;

import com.codeup.springblog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {
    @GetMapping("/posts")
    public String posts(Model model) {
        model.addAttribute("title", "View All Posts");
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(1, "This is a title", "Feeling hungry"));
        posts.add(new Post(2, "This is a thoughtful title", "Do spiders get grossed out by humans?"));
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String post(Model model, @PathVariable long id) {
        model.addAttribute("title", "View Post");

        Post thisPost = new Post(id, "This is a single post", "Dogs are the best creatures on planet Earth!!!");
        model.addAttribute("postId", thisPost.getId());
        model.addAttribute("postTitle", thisPost.getTitle());
        model.addAttribute("postBody", thisPost.getBody());
        return "posts/show";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
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
