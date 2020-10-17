package uk.co.amazon.enums;

public enum UserData {
    EMAIL("Here can be your email"),
    PASSWORD("Here can be your password");

    private String value;

    UserData(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
