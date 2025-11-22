package com.ashu.practice.dto;

import lombok.Data;

import java.util.List;

@Data
public class DroolsRequest {
    private Integer studentId;
    private List<DataSet> marksheet;

    /**
     * Data object for subject wise marks
     */
    @Data
    public static class DataSet{
        private String subject;
        private Integer marks;
        private Integer totalMarks;
    }
}