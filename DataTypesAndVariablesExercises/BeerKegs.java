package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String model = "";
        double finalVolume = 0;

        for (int i = 0; i < n; i++) {


            String modelKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * radius * radius * height;

            if (volume > finalVolume){
                model = modelKeg;
                finalVolume = volume;
            }

        }

        System.out.println(model);
    }
}
