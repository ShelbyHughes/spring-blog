package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class DiceController {

    @GetMapping("/roll-dice/{n}")
    public String rollDice(@PathVariable int n, Model model) {
        Random rand = new Random();
//        int roll = rand.nextInt(5) + 1;

        int[] dice = new int[6];
        for(int i = 0; i < dice.length; i++){
            dice[i] = rand.nextInt(6)+1; //(0 thru 5) + 1
        }

        model.addAttribute("dice", dice);
        model.addAttribute("guess", n);
        int correctCount = 0;
        for(int die : dice) {
            if(n == die) correctCount++;
        }
        if(correctCount > 0){
            model.addAttribute("resultMessage",String.format("You guessed %d out of %d correctly!", correctCount, dice.length));
//            return "You guessed correctly!";
        }else{
            model.addAttribute("resultMessage", String.format("You guessed 0 out of %d correctly. Better luck next time!", dice.length));
//            return "Better luck next time!";
        }
        return "roll-dice-n";
    }

    @GetMapping("/roll-dice")
    public String showRollDice(Model model) {
        model.addAttribute("title","Roll Dice");
        model.addAttribute("welcome", "Select a number to guess");
        return "roll-dice";
    }
}
