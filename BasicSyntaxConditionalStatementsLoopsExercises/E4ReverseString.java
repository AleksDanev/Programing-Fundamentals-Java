package BasicSyntaxConditionalStatementsLoopsExercises;

import java.util.Scanner;

public class E4ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        String reverseString = "";

        for(int i = originalString.length()-1;i>=0;i--){
            reverseString = reverseString + originalString.charAt(i);

        }
        System.out.println(reverseString);

    }
}
