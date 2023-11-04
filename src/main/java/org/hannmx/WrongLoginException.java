package org.hannmx;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Логин должен быть меньше 20 символов!");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
