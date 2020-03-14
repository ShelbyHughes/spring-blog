package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class DiceController {

    @GetMapping("/roll-dice/{n}")
    public String rollDice(@PathVariable int n, Model model) {
        Random dice = new Random();
        int roll = dice.nextInt(5) + 1;
        model.addAttribute("rolled", roll);
        model.addAttribute("guess", n);
        if(roll == n){
            model.addAttribute("resultMessage","You guessed correctly!");
//            return "You guessed correctly!";
        }else{
            model.addAttribute("resultMessage", "Better luck next time!");
//            return "Better luck next time!";
        }
        return "roll-dice-n";
    }

    @GetMapping("/roll-dice")
    public String showRollDice(Model model) {
        model.addAttribute("welcome", "Select a number to guess");
        return "roll-dice";
    }
}
