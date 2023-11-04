package org.hannmx;

public class Valid {
    public static boolean validLogPass(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException();
        }
        if (password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
        return true;
    }

}
