package BasicSyntaxConditionalStatementsLoopsExercises;

import java.util.Scanner;

public class E3GamingStore {
    public static void main(String[] args) {
        /*Write a program that helps you buy the games.
        The valid games are the following games in this table:
        Name	                    Price
        OutFall 4	                $39.99
        CS: OG	                    $15.99
        Zplinter Zell	            $19.99
        Honored 2	                $59.99
        RoverWatch	                $29.99
        RoverWatch Origins Edition	$39.99
        * */

        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double startBalance = balance;
        String input = scanner.nextLine();
        String boughtGame = "";


        while (!input.equals("Game Time")) {
            String game = input;

            if (balance > 0) {

                if (!input.equals("OutFall 4") &&
                        !input.equals("CS: OG") &&
                        !input.equals("Zplinter Zell") &&
                        !input.equals("Honored 2") && !input.equals("RoverWatch") &&
                        !input.equals("RoverWatch Origins Edition")) {
                    System.out.println("Not Found");
                    input = scanner.nextLine();
                    continue;
                }

                if (input.equals("OutFall 4") && balance >= 39.99) {
                    balance -= 39.99;
                    boughtGame = "OutFall 4";
                    System.out.printf("Bought %s\n", boughtGame);
                } else if (input.equals("CS: OG") && balance >= 15.99) {
                    balance -= 15.99;
                    boughtGame = "CS: OG";
                    System.out.printf("Bought %s\n", boughtGame);
                } else if (input.equals("Zplinter Zell") && balance >= 19.99) {
                    balance -= 19.99;
                    boughtGame = "Zplinter Zell";
                    System.out.printf("Bought %s\n", boughtGame);
                } else if (input.equals("Honored 2") && balance >= 59.99) {
                    balance -= 59.99;
                    boughtGame = "Honored 2";
                    System.out.printf("Bought %s\n", boughtGame);
                } else if (input.equals("RoverWatch") && balance >= 29.99) {
                    balance -= 29.99;
                    boughtGame = "RoverWatch";
                    System.out.printf("Bought %s\n", boughtGame);
                } else if (input.equals("RoverWatch Origins Edition") && balance >= 39.99) {
                    balance -= 39.99;
                    boughtGame = "RoverWatch Origins Edition";
                    System.out.printf("Bought %s\n", boughtGame);
                } else {
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                    continue;
                }
            }

            if (balance == 0) {
                System.out.println("Out of money!");
                break;
            }

            input = scanner.nextLine();
        }

        if (balance != 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f\n", startBalance - balance, balance);
        }
    }
}
