package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        while (numsArr.length > 1){
            int[] condensed = new int[numsArr.length -1];
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = numsArr[i] + numsArr[i + 1];
            }

            numsArr = condensed;
        }
        System.out.println(numsArr[0]);
    }
}
