import java.io.IOException;

public class PersonService {
    public static void addPerson(String dataStr) throws IOException {
        Person person = ParseService.parseString(dataStr);
        if (person == null) {
            throw new RuntimeException("Ошибка забора входной строки");
        }
        SaveService.savePersonToFile("src/", person);
    }
}
