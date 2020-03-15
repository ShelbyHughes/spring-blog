package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("Inside hello()");
        return "Hello from Spring!";
    }

//    @GetMapping("/hello/{name}")
//    @ResponseBody
//    public String sayHello(@PathVariable String name) {
//        System.out.println("Inside sayHello()");
//        return "Hello " + name + "!";
//    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }

    @GetMapping("/fruit")
    public String fruit(Model model){
        List<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("apple");
        fruitBasket.add("kiwi");
        fruitBasket.add("pear");
        fruitBasket.add("mango");
        fruitBasket.add("watermelon");
        fruitBasket.add("grapes");
        fruitBasket.add("starfruit");
        fruitBasket.add("papaya");
        fruitBasket.add("japanese pear");
        fruitBasket.add("pineapple");
        fruitBasket.add("lemon");
        fruitBasket.add("durian");
        model.addAttribute("fruitBasket", fruitBasket);
        return "fruit";
    }

    @GetMapping("/join")
    public String showJoinForm() {
        return "join";
    }

    @PostMapping("/join")
    public String joinCohort(@RequestParam(name = "cohort") String cohort, Model model) {
        model.addAttribute("cohort", "Welcome to " + cohort + "!");
        return "join";
    }

}
