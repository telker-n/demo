package com.banker.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class BankController {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(){

        return new ResponseEntity<>( "first page is here",
                HttpStatus.valueOf(200));
    }





}
