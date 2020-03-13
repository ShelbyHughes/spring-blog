package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @GetMapping("/add/{number}/and/{numbertwo}")
    @ResponseBody
    public String add(@PathVariable int number, @PathVariable int numbertwo) {
        return number + " + " + numbertwo + " = " + (number+numbertwo);
    }

    @GetMapping("/subtract/{number}/from/{numbertwo}")
    @ResponseBody
    public String subtract(@PathVariable int number, @PathVariable int numbertwo){
        return numbertwo + " - " +  number + " = " + (numbertwo-number);
    }

    @GetMapping("/multiply/{number}/and/{numbertwo}")
    @ResponseBody
    public String multiply(@PathVariable int number, @PathVariable int numbertwo){
        return number + " x " +  numbertwo + " = " + (number*numbertwo);
    }

    @GetMapping("/divide/{number}/by/{numbertwo}")
    @ResponseBody
    public String divide(@PathVariable float number, @PathVariable float numbertwo){
        return number + " % " +  numbertwo + " = " + (number/numbertwo);
    }
}
