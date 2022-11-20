import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите информацию о человеке:");
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();
        Person person = ParseService.parseString(line);
        System.out.println(person);

    }
}
