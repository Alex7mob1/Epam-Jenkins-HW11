package rozetka.enums;

public enum URLs {

    BASE_URL("https://rozetka.com.ua/");

    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}