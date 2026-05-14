package com.pavam.workshop.resources;

import com.pavam.workshop.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping(value = "/users")
public class UserResource implements Serializable {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Teste", "teste@gmail.com", "1234-5678", "123456");
        return ResponseEntity.ok().body(user);
    }
}