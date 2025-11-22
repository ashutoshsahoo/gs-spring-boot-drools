package com.ashu.practice.dto;

import lombok.Data;

@Data
public class DroolsResponse {

    private String grade;
    private Integer marksObtained;
    private Integer total;
    private Double percentage;
    private Student student;
}
