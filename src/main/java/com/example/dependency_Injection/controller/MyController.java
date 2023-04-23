package com.example.dependency_Injection.controller;


import com.example.dependency_Injection.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    @Autowired
    public MyController (MyService myService){
        this.myService = myService;
        System.out.println("MyController constructor called");
    }

    @GetMapping("/welcome")
    public String getWelcome (){
        return "Welcome";
    }

    @GetMapping("/name")
    public String getName(){
        System.out.println(" MyService.getName() has been called");
        return myService.getName();
    }
}
