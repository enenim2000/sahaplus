package com.elara.sahaplus.enums;

public enum ResponseCodes {
    SUCCESSFUL("00"),
    VALIDATION_ERROR("01"),
    SERVER_ERROR("99"),

    /* Backbone */
    B_SUCCESSFUL("B00"),
    B_VALIDATION_ERROR("B01"),
    B_SERVER_ERROR("B99");

    private final String value;

    public String getValue() {
        return value;
    }

    ResponseCodes(String value) {
        this.value = value;
    }
}
