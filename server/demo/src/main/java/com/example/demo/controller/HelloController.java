package com.example.demo.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.*;

@RestController
public class HelloController {
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/hello")
    public void sayHello() {
        Hello hello = new Hello();
        hello.Run();
    }
}
