package com.finops.bankingservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @PostMapping("/create-account")
    public String createAccount(){

        return "Account Created successfully";
    }
}
