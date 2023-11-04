package org.hannmx;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Пароль введен неверно или должен быть меньше 20 символов!");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}


