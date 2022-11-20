public class PhoneNumberFormatException extends Exception{
    private final static String MESSAGE = "ОШИБКА ФОРМАТА РОССИЙСКОГО ТЕЛЕФОННОГО НОМЕРА";

    public PhoneNumberFormatException() {
        super(MESSAGE);
    }
}
