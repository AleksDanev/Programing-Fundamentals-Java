package ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String firstIndex : firstArr) {

            for (String secondIndex : secondArr) {
                if (secondIndex.equals(firstIndex)) {
                    System.out.print(secondIndex + " ");
                    break;
                }

            }
        }
    }
}
