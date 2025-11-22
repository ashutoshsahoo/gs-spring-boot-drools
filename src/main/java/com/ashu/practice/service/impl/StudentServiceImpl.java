package com.ashu.practice.service.impl;

import com.ashu.practice.dto.Student;
import com.ashu.practice.service.StudentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@Log4j2
public class StudentServiceImpl implements StudentService {

    private final RestClient restClient;

    public StudentServiceImpl(RestClient.Builder builder) {
        this.restClient = builder
                .baseUrl("https://jsonplaceholder.typicode.com") // Set base URL
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE) // Add default accept header
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)  // Add default content-type header
                .build();
    }

    @Override
    public Student fetchDetails(Integer studentId) {
        return restClient.get()
                .uri("/users/{id}", studentId)
                .retrieve()
                .body(Student.class);
    }
}
