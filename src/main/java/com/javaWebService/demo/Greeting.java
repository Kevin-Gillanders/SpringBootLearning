package com.javaWebService.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Greeting {

    @GetMapping("/hello")
    public String World(@RequestParam String name, Model model)
    {
        System.out.println("here in greeting");
        model.addAttribute("test", name);
        System.out.println("leaving greeting");
        return "demo";
    }
}
