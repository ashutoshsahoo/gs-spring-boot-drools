package com.ashu.practice.utils;

import com.ashu.practice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Component;

/**
 * This Utility class contains util methods related to Drool and KIE
 */
@Component
@RequiredArgsConstructor
public class DroolsUtils {

    private final KieContainer kieContainer;
    private final StudentService studentService;

    /**
     * This method executes 2 param rule engine
     */
    public <T, K> T executeRuleEngine(T response, K request, String session) {
        try (KieSession kieSession = kieContainer.newKieSession(session)) {
            kieSession.setGlobal("studentService", studentService);
            kieSession.insert(response);
            kieSession.insert(request);
            kieSession.fireAllRules();
        }
        return response;
    }

    /**
     * This method executes 3 param rule engine
     */
    public <T, K, M> T executeRuleEngine(T response, K request, M threshold, String session) {
        try (KieSession kieSession = kieContainer.newKieSession(session)) {
            kieSession.setGlobal("studentService", studentService);
            kieSession.insert(response);
            kieSession.insert(request);
            kieSession.insert(threshold);
            kieSession.fireAllRules();
        }
        return response;
    }

}