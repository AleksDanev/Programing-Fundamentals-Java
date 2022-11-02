package ObjectsAndClassesLab.Sudents;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String town;

    public Student(String firstName, String lastName, int age, String town) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.town = town;
    }

    public String getTown() {
        return this.town;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }
}
