import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException, WrongLoginException, WrongPasswordException {
//        System.out.print("Введите информацию о человеке:");
//        Scanner in = new Scanner(System.in);
//        try {
//            String line = in.nextLine();
//            PersonService.addPerson(line);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        System.out.println(Account.validateAccount("abc123", "123qwert", "123qwert"));

    }
}
