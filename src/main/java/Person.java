import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private LocalDate birthDate;

    private String phoneNumber;
    private Gender gender;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public Person(String lastName, String firstName, String patronymic, LocalDate birthDate, Gender gender, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return lastName + ";" + firstName + ";" + patronymic + ";" +
                birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + ";" +
                gender + ";" + phoneNumber;
    }
}
