package com.greatlearning.microservice.controller;

import com.greatlearning.microservice.entity.PersonJava;
import com.greatlearning.microservice.protobuf.PersonOuterClass.Person;
import com.greatlearning.microservice.protobuf.PersonOuterClass.PersonList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
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

    @GetMapping(path = "/stream/{id}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<StreamingResponseBody> getPersonStream(@PathVariable int id) throws IOException {
       // generateLargeData(id);
        StreamingResponseBody streamingResponseBody = null;

        // Simulated data as an InputStream
        InputStream inputStream = simulateLargeDataAsStream(id);

        // Set response headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", "large-data.txt");

        // StreamingResponseBody to handle streaming
        streamingResponseBody = outputStream -> {
            byte[] buffer = new byte[8192]; //Adjust the buffer size as needed

            int bytesRead;
            try {
                while ((bytesRead = inputStream.read(buffer)) != -1){
                    outputStream.write(buffer,0, bytesRead);
                    outputStream.flush();
                }
            }finally {
                inputStream.close();
            }

        };

        return ResponseEntity.ok()
                .header(String.valueOf(headers))
                .body(streamingResponseBody);
    }

    @GetMapping(path = "/stream2/{id}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<StreamingResponseBody> getLargeData(@PathVariable int id) throws IOException {

        // Set response headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", "large-data.txt");

        // StreamingResponseBody to handle streaming
        StreamingResponseBody streamingResponseBody = outputStream -> {
            generateLargeDataToStream(outputStream);
        };

        return ResponseEntity.ok()
                .header(String.valueOf(headers))
                .body(streamingResponseBody);
    }

    private void generateLargeDataToStream(OutputStream outputStream) {
        for (int i = 1; i <= 500000000 / 2; ) {
            StringBuilder builder = new StringBuilder();
            for(int j = i ; j < i + 1000000; j ++) {
                builder.append(new PersonJava(i, "Manoj" + i, "manoj.er.kumar" + i + "@gmail.com"));
            }
            String chunk = builder.toString();
            try {
                byte[] bytes = chunk.getBytes(StandardCharsets.UTF_8);
                outputStream.write(bytes);
                outputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
                break; // Exit the loop on error
            }

            i = i +1000000;
        }

//        for (int i = 1; i < 5000000 /2; i++) {
//            builder.append(new PersonJava(i,"Manoj" + i, "manoj.er.kumar" + i + "@gmail.com") );
//        }
    }

    private InputStream simulateLargeDataAsStream(int id) throws IOException {
        System.out.println("Going to generate large data set");
        //String largeData = generateLargeData(id);
        String largeData = generateLargeData();

        // Simulated large data as an InputStream
//        return new InputStreamResource(largeData.getBytes(StandardCharsets.UTF_8)).getInputStream();
//        return new InputStreamResource(new ByteArrayInputStream(largeData.getBytes(StandardCharsets.UTF_8))).getInputStream();
        InputStreamResource inputStreamResource =  new InputStreamResource(new ByteArrayInputStream(largeData.getBytes(StandardCharsets.UTF_8)));

        return inputStreamResource.getInputStream();
    }

    private static String generateLargeData() {
        // Simulated large data (5 GB), replace with your actual data generation logic
        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < 500000000/ 2; i++) {
//            builder.append("Aa");
//        }
        for (int i = 1; i < 5000000 /2; i++) {
            builder.append(new PersonJava(i,"Manoj" + i, "manoj.er.kumar" + i + "@gmail.com") );
        }
        return builder.toString();
    }
    private String generateLargeData(int id) {
        StringBuilder builder = new StringBuilder();
        System.out.println("inside large data set");
        for (int i = id; i < id + 1000000; i++) {
            builder.append(new PersonJava(i,"Manoj" + i, "manoj.er.kumar" + i + "@gmail.com") );
        }
        return builder.toString();

    }

    @GetMapping("/v2/{id}")
    public ResponseEntity<PersonList> getPersonProtoBuf(@PathVariable int id){

        PersonList.Builder persons = PersonList.newBuilder();

        for (int i = id; i < id+ 1000000; i++) {
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
