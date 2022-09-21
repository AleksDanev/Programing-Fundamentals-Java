package BasicSyntaxConditionalStatementsLoopsExercises;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfSabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobers = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double neededSabers = Math.ceil(countOfStudents * 1.1);
        int freeBelts = 0;

        for (int i = 1; i <= countOfStudents ; i++) {
            if ( i % 6 == 0){
                freeBelts = freeBelts +1;
            }
        }

        int belts = countOfStudents - freeBelts;

        double totalPrice = (priceOfSabers * neededSabers) +
                (priceOfRobers * countOfStudents) + (belts * priceOfBelts);

        if (totalPrice <= amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }else {
            double sum = totalPrice - amountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.", sum);
        }

    }
}
