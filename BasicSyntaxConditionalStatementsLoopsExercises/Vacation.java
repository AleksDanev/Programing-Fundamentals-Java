package BasicSyntaxConditionalStatementsLoopsExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;

        if (group.equalsIgnoreCase("Students")){
            switch (day) {
                case "Friday":
                    price = 8.45;
                    break;
                case "Saturday":
                    price = 9.80;
                    break;
                case "Sunday":
                    price = 10.46;
                    break;
            }

            totalPrice = number * price;

            if (number >= 30){
                totalPrice = totalPrice - (totalPrice * 0.15);
            }


        }else if (group.equalsIgnoreCase("Business")){
            switch (day) {
                case "Friday":
                    price = 10.90;
                    break;
                case "Saturday":
                    price = 15.60;
                    break;
                case "Sunday":
                    price = 16.00;
                    break;
            }

            if (number >= 100){
                number = number - 10;
            }

            totalPrice = number * price;


        }else if (group.equalsIgnoreCase("Regular")){
            switch (day) {
                case "Friday":
                    price = 15.00;
                    break;
                case "Saturday":
                    price = 20.00;
                    break;
                case "Sunday":
                    price = 22.50;
                    break;
            }

            totalPrice = number * price;

            if (number >= 10 && number <= 20){
                totalPrice = totalPrice - (totalPrice * 0.05);
            }

        }

        System.out.printf("Total price: %.2f", totalPrice);

    }
}
