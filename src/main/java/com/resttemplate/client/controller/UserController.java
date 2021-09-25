package com.resttemplate.client.controller;

import com.resttemplate.client.models.Todos;
import com.resttemplate.client.models.User;
import com.resttemplate.client.service.Request;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequestMapping("/api")
@RestController
@AllArgsConstructor
public class UserController {

    private final Request request;
    private final RestTemplate restTemplate ;



    @GetMapping("/listtodos")
    public ResponseEntity<List<Todos>> getAllTodos(){
        return ResponseEntity.ok(this.request.getAllTodos());
    }

    @GetMapping("/listuser")
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok(this.request.getAllUser());
    }

    @GetMapping("/getTodos")
    public ResponseEntity<Todos> getTodos(@RequestParam int id){
        return ResponseEntity.ok(this.request.getTodos(id));

    }

    @PostMapping("/savetodos")
    public ResponseEntity<Todos> getTodos(Todos todos){
         return this.request.postTodos(todos);

    }


}
