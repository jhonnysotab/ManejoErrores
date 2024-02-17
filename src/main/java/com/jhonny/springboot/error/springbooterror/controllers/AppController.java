package com.jhonny.springboot.error.springbooterror.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhonny.springboot.error.springbooterror.exception.UserNotFoundException;
import com.jhonny.springboot.error.springbooterror.models.domain.User;
import com.jhonny.springboot.error.springbooterror.services.UserService;
@RestController
public class AppController {
   
    
    @Autowired
    private UserService service;
    @GetMapping("/app")
    public String index() {
        // int value = 100 / 0;
        int value = Integer.parseInt("20x");
        System.out.println(value);
        return "ok 200";
    }
    @GetMapping("/show/{id}")
    public User show(@PathVariable(name = "id") Long id) {
        User user = service.findById(id).orElseThrow(()-> new UserNotFoundException("Error el usuario no existe!"));
        System.out.println(user.getLasName());
        return user;
    }
    
}
