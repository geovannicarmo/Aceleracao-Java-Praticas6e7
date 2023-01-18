package com.helloword.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helloword.api.dto.ExerciseDTO;

@RestController
@RequestMapping("/")
public class ExerciseController {
    
    @GetMapping
    public String getUsers(){
        return "Olá Spring";
    }

    @PostMapping
    public void creatUser(@RequestBody ExerciseDTO req){
        System.out.println(req.modelo());
        System.out.println(req.valor());
        System.out.println(req.dataFabricacao());
    }
}  
