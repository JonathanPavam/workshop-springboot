package com.pavam.workshop.resources;

import com.pavam.workshop.entities.Order;
import com.pavam.workshop.entities.User;
import com.pavam.workshop.services.OrderService;
import com.pavam.workshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping(value = "/orders/")
public class OrderResource implements Serializable {

    @Autowired
    OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> list = orderService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity <Order> findById (@PathVariable Long id) {
        Order obj = orderService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    }