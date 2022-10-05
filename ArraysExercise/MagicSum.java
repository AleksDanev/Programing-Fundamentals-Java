package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= array.length -1; index++) {
            int firstIndex = array[index];
            for (int i = index + 1; i <= array.length -1 ; i++) {
                int secondIndex = array[i];

                if (firstIndex + secondIndex == magicNumber){
                    System.out.println(firstIndex + " " + secondIndex);
                }
            }
        }
    }
}
