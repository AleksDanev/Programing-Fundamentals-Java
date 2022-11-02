package ObjectsAndClassesLab.Sudents;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] arrStudentData = inputLine.split("\\s+");
            String firstName = arrStudentData[0];
            String lastName = arrStudentData[1];
            int age = Integer.parseInt(arrStudentData[2]);
            String town = arrStudentData[3];

            Student currentStudent = new Student(firstName, lastName, age, town);
            studentsList.add(currentStudent);

            inputLine = scanner.nextLine();
        }

        String homeTown = scanner.nextLine();

        for (Student item : studentsList) {
            if (item.getTown().equals(homeTown)) {
                System.out.printf("%s %s is %d years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }
}