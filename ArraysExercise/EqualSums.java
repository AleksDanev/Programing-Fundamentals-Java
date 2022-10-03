package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isFound = false;
        for (int index = 0; index <= numbers.length - 1; index++) {

            int leftSum = 0;
            int rightSum = 0;
            // leftSum
            for (int i = 0; i < index; i++) {
                leftSum = leftSum + numbers[i];
            }
            // rightSum
            for (int i = index+1; i <= numbers.length -1; i++) {
                rightSum = + rightSum + numbers[i];
            }

            if (leftSum == rightSum){
                isFound = true;
                System.out.println(index);
                break;
            }
        }
        if (!isFound) {
            System.out.println("no");
        }
    }
}
