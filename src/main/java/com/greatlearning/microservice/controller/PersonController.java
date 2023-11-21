package com.greatlearning.microservice.controller;

import com.greatlearning.microservice.entity.PersonJava;
import com.greatlearning.microservice.protobuf.PersonOuterClass.PersonList;
import com.greatlearning.microservice.protobuf.PersonOuterClass.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {



    @GetMapping("/{id}")
    public ResponseEntity<List<PersonJava>> getPerson(@PathVariable int id){
        List<PersonJava> persons = new ArrayList<>();
        for (int i = id; i < id + 10000000; i++) {
            persons.add(new PersonJava(i,"Manoj" + i, "manoj.er.kumar" + i + "@gmail.com") );
        }
        return  new ResponseEntity<>(persons, HttpStatus.OK);
    }

    @GetMapping("/stream/{id}")
    public ResponseEntity<StreamingResponseBody> getPersonStream(@PathVariable int id){
        generateLargeData(id);
        StreamingResponseBody streamingResponseBody = null;

        // Simulated data as an InputStream
        InputStream inputStream = simulateLargeDataAsStream(id);

        // Set response headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", "large-data.txt");

        return  new ResponseEntity<>(streamingResponseBody, HttpStatus.OK);
    }

    private InputStream simulateLargeDataAsStream(int id) {
        String largeData = generateLargeData(id);
        // Simulated large data as an InputStream
        return new InputStreamResource(largeData.getBytes(StandardCharsets.UTF_8)).getInputStream();
    }
    private String generateLargeData(int id) {
        StringBuilder builder = new StringBuilder();
        //List<PersonJava> persons = new ArrayList<>();
        for (int i = id; i < id + 10000000; i++) {
            builder.append(new PersonJava(i,"Manoj" + i, "manoj.er.kumar" + i + "@gmail.com") );
        }
        return builder.toString();

    }

    @GetMapping("/v2/{id}")
    public ResponseEntity<PersonList> getPersonProtoBuf(@PathVariable int id){

        PersonList.Builder persons = PersonList.newBuilder();

        for (int i = id; i < id+ 10000000; i++) {
            Person newPerson = Person.newBuilder()
                    .setId(i)
                    .setName("Manoj" + i)
                    .setEmail("manoj.er.kumar" + i + "@gmail.com")
                    .build();
            persons.addPersons(newPerson);
        }

       return  new ResponseEntity<>(persons.build(), HttpStatus.OK);
    }

    @GetMapping("/v1/{id}")
    public ResponseEntity<Person> getPersonProtoBufSingle(@PathVariable int id){

        Person newPerson = Person.newBuilder()
                    .setId(id)
                    .setName("Manoj" + id)
                    .setEmail("manoj.er.kumar" + id + "@gmail.com")
                    .build();
        return  new ResponseEntity<>(newPerson, HttpStatus.OK);
    }
}
