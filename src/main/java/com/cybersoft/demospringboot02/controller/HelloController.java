package com.cybersoft.demospringboot02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Annotation dinh nghia duong dan:
 * @Controller: tra ra noi dung HTML
 * @RestController: tra ve String chuyen dung de viet API
 * @ResponseBody: tra noi dung kieu String
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello(){
        return "Hello Spring Boot";
    }

    @GetMapping("/cybersoft")
    public String helloCybersoft(){
        return "Hello Cybersoft";
    }



}
