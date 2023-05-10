package com.finops.bankingservice.controller;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/create-account/{name}/{age}/{gender}")
    public Document createAccount(@PathVariable String name, @PathVariable int age, @PathVariable String gender){

        Document account = new Document();
        account.put("accountHolderName", name);
        account.put("holderAge", age);
        account.put("Gender", gender);

        Document newBankAccounts = mongoTemplate.save(account, "NewBankAccounts");
        return newBankAccounts;

    }
}
