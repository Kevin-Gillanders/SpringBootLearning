package com.javaWebService.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class talkController {
    private String sentence = "You said %s";

    @GetMapping("/saythis")
    public Talk SayThis(@RequestParam(value = "say", defaultValue = "I am a dork") String say)
    {
        Talk t = new Talk("sadfkdasf");
        System.out.println(t);
        return new Talk(String.format(sentence, say));
    }


}
