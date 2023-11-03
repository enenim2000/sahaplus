package com.elara.bankone.enums;

public enum Gender implements PersistableEnum<String> {
    Male("0"),
    Female("1");

    private final String value;

    public String getValue() {
        return value;
    }

    Gender(String value) {
        this.value = value;
    }

    public static class Converter extends EnumValueTypeConverter<Gender, String> {
        public Converter() {
            super(Gender.class);
        }
    }
}
