public class GenderFormatException extends Exception{
    private final static String MESSAGE = "ОШИБКА ФОРМАТА ОБОЗНАЧЕНИЯ ПОЛА";
    public GenderFormatException () {
        super(MESSAGE);
    }
}
