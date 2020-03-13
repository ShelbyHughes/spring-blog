package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String posts() {
        return "posts index page";
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String post(@PathVariable int id) {
        return "view an individual post";
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
