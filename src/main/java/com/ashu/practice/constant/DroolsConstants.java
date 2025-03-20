package com.ashu.practice.constant;

import lombok.Getter;

@Getter
public enum DroolsConstants {
    KIE_SESSION_RULES("kie-session-rules");


    private final String session;

    private DroolsConstants(String session) {
        this.session=session;
    }
}
