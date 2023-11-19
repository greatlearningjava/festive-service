package com.greatlearning.microservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class PersonJava {
    int id = 1001;
    String name = "Manoj";
    boolean isEmployeed = true;
}
