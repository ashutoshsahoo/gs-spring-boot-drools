package com.ashu.practice.web;

import com.ashu.practice.dto.DroolsRequest;
import com.ashu.practice.dto.DroolsResponse;
import com.ashu.practice.service.DroolsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/rules/")
public class DroolsController {

    private final DroolsService droolsService;


    /**
     * This POST API calculates total marks, percentage and passing grade based on the input provided
     */
    @PostMapping("calculateResult")
    public DroolsResponse calculateResult(@RequestBody DroolsRequest request) {
        return droolsService.calculateResult(request);
    }

}
