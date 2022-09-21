package BasicSyntaxConditionalStatementsLoopsExercises;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int i = userName.length() -1; i >= 0 ; i--) {
            password += userName.charAt(i);
        }

        String strike = scanner.nextLine();
        int counter = 1;

        while (!strike.equals(password)){
            if (counter >= 4){
                break;
            }
            System.out.println("Incorrect password. Try again.");
            counter++;
            strike = scanner.nextLine();
        }
        if (strike.equals(password)){
            System.out.printf("User %s logged in.", userName);
        }else {
            System.out.printf("User %s blocked!", userName);
        }
    }
}
