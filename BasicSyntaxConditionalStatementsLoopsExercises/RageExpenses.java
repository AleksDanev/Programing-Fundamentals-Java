package BasicSyntaxConditionalStatementsLoopsExercises;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headset = lostGames / 2;
        int mouse = lostGames / 3;
        int keyboard = lostGames / 6;
        int display = lostGames / 12;

        double costs = (headset * headsetPrice) + (mouse * mousePrice) +
                (keyboard * keyboardPrice) + (display * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", costs);


    }
}
