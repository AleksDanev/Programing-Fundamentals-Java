package DataTypesAndVariables;

import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character = scanner.nextLine().charAt(0);

        if (Character.isLowerCase(character)){
            System.out.println("lower-case");
        }else {
            System.out.println("upper-case");
        }
    }
}
