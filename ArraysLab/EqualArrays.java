package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        boolean isTrue = true;
        int index = 0;

        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == secondArr[i]) {
                sum = sum + firstArr[i];
            } else {
                index = i;
                isTrue = false;
                break;
            }
        }

        if (isTrue) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }

    }
}
