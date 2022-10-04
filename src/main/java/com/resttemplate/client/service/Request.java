package com.resttemplate.client.service;

import com.resttemplate.client.models.Todos;
import com.resttemplate.client.models.User;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class Request {

    private final RestTemplate restTemplate;

    public List<Todos> getAllTodos() {
        String uri = "https://jsonplaceholder.typicode.com/todos";
        ResponseEntity<List> response = this.restTemplate.getForEntity(uri, List.class);
        List<Todos> todos = response.getBody();
        return (todos);


    }



    public List<User> getAllUser() {
        String uri = "https://jsonplaceholder.typicode.com/users";
        ResponseEntity<List> response = this.restTemplate.getForEntity(uri, List.class);
        List<User> users = response.getBody();
        return (users);
    }



    public Todos getTodos(int id) {
        String uri = "https://jsonplaceholder.typicode.com/posts/";
       Todos responseTodos = this.restTemplate.getForObject(uri+id,Todos.class);
        return (responseTodos);
    }

    public ResponseEntity<Todos> postTodos(Todos todos){
        String uri = "https://jsonplaceholder.typicode.com/posts/";
       return   this.restTemplate.postForEntity(uri,todos,Todos.class);

    }


}
