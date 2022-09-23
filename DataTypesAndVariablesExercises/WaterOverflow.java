package DataTypesAndVariablesExercises;
import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int water = 0;

        for (int i = 0; i < n; i++) {
            int pour = Integer.parseInt(scanner.nextLine());
            if (pour+water<=255){
                water+=pour;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(water);
    }
}
