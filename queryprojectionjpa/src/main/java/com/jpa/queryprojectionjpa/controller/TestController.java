package com.jpa.queryprojectionjpa.controller;

import com.jpa.queryprojectionjpa.model.Author;
import com.jpa.queryprojectionjpa.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    AuthorRepository authorRepository;
    @GetMapping("/test")
    public String add(){
        Author author1 = new Author("Belay", "Tewelde");
        authorRepository.save(author1);
        return "Successfully added";
    }

}
