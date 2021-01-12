package com.schwab.eam.controller;


import com.schwab.eam.entity.ApiRegistration;
import com.schwab.eam.entity.ReachedContact;
import com.schwab.eam.service.ReachedContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReachedContactsController {

    @Autowired
    ReachedContactService service;

    @PostMapping("/add/contact")
    public ReachedContact createUser(@RequestBody ReachedContact contact){
        return service.addReachedContact(contact);
    }

    @GetMapping("/get/contactId/{id}")
    public Optional<ReachedContact> findOneApi(@RequestParam("id") Long contactId){
        return service.getById(contactId);
    }

    @GetMapping("/all/contacts")
    public List<ReachedContact> findAll(){
        return service.getAllReachedContacts();
    }




}
