package com.elara.sahaplus.enums;

public enum AccountStatus implements PersistableEnum<String> {
    Active("0"),
    InActive("1"),
    Closed("2"),
    Dormant("3");

    private final String value;

    public String getValue() {
        return value;
    }

    AccountStatus(String value) {
        this.value = value;
    }

    public static class Converter extends EnumValueTypeConverter<AccountStatus, String> {
        public Converter() {
            super(AccountStatus.class);
        }
    }
}
