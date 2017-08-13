package com.gornix.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gornix.helloworld.Helloworld;

@RestController
public class DemoController {

    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable("name") String name) {

        return new Helloworld().greeting(name);
    }

}
