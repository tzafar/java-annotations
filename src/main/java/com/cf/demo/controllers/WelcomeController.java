package com.cf.demo.controllers;

import com.cf.demo.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class WelcomeController {

    @PostMapping("/getperson")
    public ResponseEntity welcome(@RequestBody @Valid Person person){
        return ResponseEntity.ok().body(person);
    }

}
