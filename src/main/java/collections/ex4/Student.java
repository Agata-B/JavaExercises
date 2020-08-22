package collections.ex4;


public class Student {
    private String firstName;
    private String lastName;
    private MainLanguage mainLanguage;

    public Student(String firstName, String lastName, MainLanguage mainLanguage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mainLanguage = mainLanguage;
    }

    @Override
    public String toString() {
        return "Student " + firstName + " " + lastName + " " + mainLanguage;
    }
}
