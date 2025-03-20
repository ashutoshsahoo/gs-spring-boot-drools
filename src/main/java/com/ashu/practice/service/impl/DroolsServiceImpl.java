package com.ashu.practice.service.impl;

import com.ashu.practice.constant.DroolsConstants;
import com.ashu.practice.dto.DroolsRequest;
import com.ashu.practice.dto.DroolsResponse;
import com.ashu.practice.service.DroolsService;
import com.ashu.practice.utils.DroolsUtils;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class DroolsServiceImpl implements DroolsService {
    @Autowired
    private DroolsUtils droolsUtils;

    /**
     * This method calculates DroolsResponse based on the request and the rules written for that session
     * @param request
     * @return
     */
    @Override
    public DroolsResponse calculateResult(DroolsRequest request) {
        log.info("initiating calculate result");
        return droolsUtils.executeRuleEngine(new DroolsResponse(), request, DroolsConstants.KIE_SESSION_RULES.getSession());
    }

}
