package BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());


        int result = 0;
        if (multiplier <= 10) {
            for (int i = multiplier; i <= 10; i++) {
                result = digit * i;
                System.out.printf("%d X %d = %d%n", digit, i, result);
            }

        }else {
            result = digit * multiplier;
            System.out.printf("%d X %d = %d%n", digit, multiplier,result);
        }
    }
}
