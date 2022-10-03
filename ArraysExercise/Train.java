package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWagons = Integer.parseInt(scanner.nextLine());

        int sumOfPeople = 0;
        int[] train = new int[numberOfWagons];

        for (int i = 0; i < train.length; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            train[i] = people;
            sumOfPeople += people;
        }

        for (int wagon:train) {
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(sumOfPeople);

    }
}
