package BasicSyntaxConditionalStatementsLoopsExercises;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double totalMoney = 0;

        for (int i = 1; i <= orders ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());

            double moneyForOrder = ((days * capsules) * pricePerCapsule);
            totalMoney += moneyForOrder;

            System.out.printf("The price for the coffee is: $%.2f%n", moneyForOrder);
        }

        System.out.printf("Total: $%.2f", totalMoney);

    }
}
