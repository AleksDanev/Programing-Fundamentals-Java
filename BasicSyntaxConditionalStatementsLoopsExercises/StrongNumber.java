package BasicSyntaxConditionalStatementsLoopsExercises;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int endNumber = Integer.parseInt(number);

        int factNum = 0;
        int lastNumToMultiply = 1;

        for (int i = 0; i <= number.length() -1 ; i++) {
            char currentN = number.charAt(i);
            int currentNumber = Character.getNumericValue(currentN);
            for (int j = currentNumber; j >=1 ; j--) {
                lastNumToMultiply = lastNumToMultiply * j;
            }
            factNum = factNum + lastNumToMultiply;
            lastNumToMultiply = 1;
        }

        if (endNumber == factNum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
