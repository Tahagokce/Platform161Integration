package com.resttemplate.client.controller;

import com.resttemplate.client.models.Todos;
import com.resttemplate.client.models.User;
import com.resttemplate.client.register.RegisterClientService;
import com.resttemplate.client.register.request.ClientRequest;
import com.resttemplate.client.register.request.RegisterBaseRequest;
import com.resttemplate.client.register.request.ServiceRequest;
import com.resttemplate.client.register.request.useradd.UserAddContacts;
import com.resttemplate.client.register.request.useradd.UserAddRequest;
import com.resttemplate.client.service.Request;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequestMapping("/api")
@RestController
@AllArgsConstructor
public class UserController {

    private final Request request;

    private final RegisterClientService registerClientService;

    @GetMapping("/listtodos")
    public ResponseEntity<List<Todos>> getAllTodos() {
        return ResponseEntity.ok(this.request.getAllTodos());
    }

    @GetMapping("/listuser")
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok(this.request.getAllUser());
    }

    @GetMapping("/getTodos")
    public ResponseEntity<Todos> getTodos(@RequestParam int id) {
        return ResponseEntity.ok(this.request.getTodos(id));

    }

    @PostMapping("/savetodos")
    public ResponseEntity<Todos> getTodos(Todos todos) {
        return this.request.postTodos(todos);

    }

    @GetMapping("/deneme")
    public String falan (){
        RegisterBaseRequest userAddRequest = new RegisterBaseRequest();
        ServiceRequest<UserAddRequest> userAddRequestServiceRequest = new ServiceRequest<>();

        UserAddRequest request = new UserAddRequest();
        UserAddContacts userAddContacts = new UserAddContacts();
        ClientRequest clientRequest = new ClientRequest();
        clientRequest.setClientRef("adsfds");
        clientRequest.setApplicationGUID("aasdfadsdsfds");


        userAddContacts.setContactType("adf");
        userAddContacts.setAddressLine2("1231");
        userAddContacts.setAddressLine1("adf");
        userAddContacts.setCity("adf");
        userAddContacts.setCountryCode("adf");
        userAddContacts.setEmailAddress("adf");
        userAddContacts.setFirstName("taha gokce");
        userAddContacts.setPostalCode("adf");
        userAddContacts.setState("adf");
        userAddContacts.setProvince("adf");
        userAddContacts.setLastName("adf");

        request.setUserID("falanlarfilanlar");
        request.setUserAccountName("falanlar");
        request.setContacts(userAddContacts);

        userAddRequestServiceRequest.setCommand("userAdd");
        userAddRequestServiceRequest.setClient(clientRequest);
        userAddRequestServiceRequest.setRequest(request);
        userAddRequest.setServiceRequest(userAddRequestServiceRequest);

        return registerClientService.userAdd(userAddRequest);
    }

}
