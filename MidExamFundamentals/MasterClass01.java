package MidExamFundamentals;

import java.util.Scanner;

public class MasterClass01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOfFlour = Double.parseDouble(scanner.nextLine());
        double priceOfOneEgg = Double.parseDouble(scanner.nextLine());
        double priceOfOneApron = Double.parseDouble(scanner.nextLine());

        int freeFlour = 0;
        for (int i = 1; i <= students; i++) {
            if (i % 5 == 0){
                freeFlour++;
            }
        }
        int numberApronToBuy = (int) Math.ceil(students*1.2);
        double apronTotalPrice = numberApronToBuy * priceOfOneApron;
        double flourTotalPrice = (students - freeFlour) * priceOfFlour;
        double eggsTotalPrice = students * (priceOfOneEgg * 10);

        double totalPrice = apronTotalPrice + flourTotalPrice + eggsTotalPrice;

        if (totalPrice <= budget){
            System.out.printf("Items purchased for %.2f$.", totalPrice);
        }else {
            double needMoney = totalPrice - budget;
            System.out.printf("%.2f$ more needed.", needMoney);
        }
    }
}
