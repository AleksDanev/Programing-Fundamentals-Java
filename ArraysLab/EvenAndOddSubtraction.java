package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] numbersArr = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 == 0) {
                oddSum += numbersArr[i];
            } else {
                evenSum += numbersArr[i];
            }
        }
        int finalSum = oddSum - evenSum;
        System.out.println(finalSum);
    }
}
