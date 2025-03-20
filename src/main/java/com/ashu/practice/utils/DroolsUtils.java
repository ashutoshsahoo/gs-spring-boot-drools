package com.ashu.practice.utils;

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

    /**
     * This method executes 2 param rule engine
     */
    public <T, K> T executeRuleEngine(T score, K request, String session) {
        try (KieSession kieSession = kieContainer.newKieSession(session)) {
            kieSession.insert(score);
            kieSession.insert(request);
            kieSession.fireAllRules();
//            kieSession.dispose();
        }
        return score;
    }

    /**
     * This method executes 3 param rule engine
     */
    public <T, K, M> T executeRuleEngine(T score, K request, M threshold, String session) {
        try (KieSession kieSession = kieContainer.newKieSession(session)) {
            kieSession.insert(score);
            kieSession.insert(request);
            kieSession.insert(threshold);
            kieSession.fireAllRules();
//            kieSession.dispose();
        }
        return score;
    }

}