package de.sschleis.rest.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${test.value:world}")
    private String text;

    @RequestMapping("/")
    public String hello() {
        return "Hello " + text;
    }
}
