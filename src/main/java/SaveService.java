import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveService {
    public static void savePersonToFile(String pathStr, Person person) throws IOException {

        String directoryPath = pathStr;
        File file = new File(directoryPath);
        if (file.isDirectory()) {
            System.out.println("File is a Directory");
        } else {
            throw new IOException("Директории" + pathStr + " не существует");
        }
        String filePath = pathStr + "/" + person.getLastName() + ".csv";
        File result = new File(filePath);
        FileWriter writer = null;
        try {
            if (result.exists()) {
                writer = new FileWriter(filePath, true);
                writer.write(person.toString() + "\n");
            } else {
                writer = new FileWriter(filePath);
                writer.write("Фамилия;Имя;Отчество;Дата рождения;Пол;Номертелефона" + "\n");
                writer.write(person.toString() + "\n");
            }
        } catch (IOException e) {
            throw new IOException("Ошибка записи данных о человеке в файл");
        } finally {
            writer.close();
        }

    }
}
