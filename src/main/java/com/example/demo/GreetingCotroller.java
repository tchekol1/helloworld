package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingCotroller {

   // private static final String template ="Hello, %s!";
   // private final AtomicLong counter = new AtomicLong();
    @GetMapping("/")
    public String  Reqma(@RequestParam(value = "name",defaultValue = "World") String name, Model model){
        model.addAttribute("name",name);

        return "greeting.html";


    }
}
