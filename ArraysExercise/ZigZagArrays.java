package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[count];
        String[] secondArr = new String[count];

        for (int i = 1; i <= count; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstNumber = input[0];
            String secondNumber = input[1];

            if (i % 2 == 0){
                firstArr[i-1] = secondNumber;
                secondArr[i-1] = firstNumber;
            }else {
                firstArr[i-1] = firstNumber;
                secondArr[i-1] = secondNumber;
            }
        }

        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
