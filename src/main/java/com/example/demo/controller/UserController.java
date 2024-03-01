package com.example.demo.controller;

@RestController
@RequestMapping
public class UserController {
    @GetMapping
    public String sayHi(){
        return "Hi";
    }
}
