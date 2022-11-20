import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class ParseService {
    private static final int FIELDS_COUNT = 6;

    private static LocalDate getDate(String dateStr) throws Exception {
        String[] dateFields = dateStr.split("[.]");
        if (dateFields.length != 3) {
            throw new RuntimeException("Invalid date format");
        }
        try {
            LocalDate localDate = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            return localDate;
        } catch (Exception e) {
            throw new RuntimeException("Invalid date format");
        }
    }

    private static String getPhone(String phoneNumber) throws PhoneNumberFormatException {
        if (Pattern.matches("89[0-9]{9}", phoneNumber)) {
            return phoneNumber;
        } else {
            throw new PhoneNumberFormatException();
        }
    }
    private static Gender getGender(String gender) throws GenderFormatException {
        if (gender.equals("m") || gender.equals("M")) {
            return Gender.MALE;
        } else if (gender == "f" || gender == "F") {
            return Gender.MALE;
        } else {
            throw new GenderFormatException();
        }
    }

    public static Person parseString(String inputLine) {
        String[] fields = inputLine.split(" ");
        try {
            if (fields.length > FIELDS_COUNT) {
                throw new RuntimeException("Количество полей в стоке больше требуемого");
            } else if (fields.length < FIELDS_COUNT) {
                throw new RuntimeException("Количество полей в стоке меньше требуемого");
            } else {


                return new Person(fields[0], fields[1], fields[2], getDate(fields[3]), getGender(fields[4]), getPhone(fields[5]));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
