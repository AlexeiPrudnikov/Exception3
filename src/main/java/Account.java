import java.util.regex.Pattern;

public class Account {
    private static void validateLogin(String login) throws WrongLoginException {
        if (login == null) {
            throw new NullPointerException("Login не может быть null");
        }
        if (Pattern.matches("[a-zA-z0-9_]{1,20}", login)) {
            return;
        } else {
            throw new WrongLoginException();
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password == null || confirmPassword == null) {
            throw new NullPointerException("Пароль и его подтверждение не могут быть null");
        }
        if (!Pattern.matches("[a-zA-z0-9_]{1,20}", password)) {
            throw new WrongPasswordException("Пароль не удовлетворяет требованиям сложности");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение не совпадают");
        }
    }

    public static boolean validateAccount(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
