package com.greatlearning.microservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonJava {
    int id = 1001;
    String name = "Manoj";
    String email = "sample-email@gmail.com";
}
