package com.resttemplate.client.models;

import lombok.Data;

@Data
public class Todos {

    private int id;
    private int userId;
    private String title;
    private String completed ;


}
