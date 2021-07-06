package com.is4ii4s.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonControlller {

    @GetMapping
    public String getBook() {
        return "API Test!";
    }
}
