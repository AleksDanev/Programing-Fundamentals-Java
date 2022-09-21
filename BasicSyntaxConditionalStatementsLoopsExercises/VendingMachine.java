package BasicSyntaxConditionalStatementsLoopsExercises;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coin = scanner.nextLine();
        double totalMoney = 0;
        while (!"Start".equals(coin)) {
            double c = Double.parseDouble(coin);
            if (!(c == 0.1 || c == 0.2 || c == 0.5 || c == 1.0)) {
                System.out.printf("Cannot accept %.2f\n", c);
            } else {
                totalMoney += c;
            }
            coin = scanner.nextLine();
        }
        String item = scanner.nextLine();
        while (!"End".equals(item)) {
            switch (item) {
                case "Nuts":
                    if (totalMoney - 2.0 >= 0) {
                        totalMoney -= 2.0;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (totalMoney - 0.7 >= 0) {
                        totalMoney -= 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (totalMoney - 1.5 >= 0) {
                        totalMoney -= 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (totalMoney - 0.8 >= 0) {
                        totalMoney -= 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (totalMoney - 1.0 >= 0) {
                        totalMoney -= 1.0;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            item = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",totalMoney);

    }
}
