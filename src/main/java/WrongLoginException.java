public class WrongLoginException extends Exception {
    private final static String MESSAGE = "Login должен содержать только латинские буквы, цифры и знак подчеркивания";

    public WrongLoginException() {
        super(MESSAGE);
    }

    public WrongLoginException(String message) {
        super(message);
    }

}
