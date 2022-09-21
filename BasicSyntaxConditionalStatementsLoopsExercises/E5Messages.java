package BasicSyntaxConditionalStatementsLoopsExercises;

import java.util.Scanner;

public class E5Messages {
    public static void main(String[] args) {
        /*Write a program that emulates typing an SMS, following this guide:
        1	    2       3
                abc     def
        4       5       6
        ghi	    jkl     mno
        7       8       9
        pqrs    tuv	    wxyz
	            0
                space
        Following the guide, 2 becomes "a", 22 becomes "b" and so on.
        * */
        Scanner scanner = new Scanner(System.in);

        int typingSymbol = Integer.parseInt(scanner.nextLine());
        String message = "";


        for (int i = 0; i < typingSymbol; i++) {

            String digits = scanner.nextLine();
            int digitLength = digits.length(); // намираме броя на цифрите
            int digit = digits.charAt(0) - '0'; // намираме първия символ
            int offset = (digit - 2) * 3; // намираме изместването

            if (digit == 0) {
                message += (char) (digit + 32); // 32 == space
                continue;
            }

            if (digit == 8 || digit == 9) {
                offset++;
            }

            int letterIndex = offset + digitLength - 1;
            message += (char) (letterIndex + 97); // 97 e буквата 'а'

        }
        System.out.println(message);
    }
}
