package com.ashu.practice.service;

import com.ashu.practice.dto.DroolsRequest;
import com.ashu.practice.dto.DroolsResponse;

/**
 * Service Interface for Drools Related Service APIs
 *
 */
public interface DroolsService {

    /**
     * This method calculates DroolsResponse based on the request and the rules written for that session
     * @param request
     * @return
     */
    DroolsResponse calculateResult(DroolsRequest request);
}
