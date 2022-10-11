package MethodsLab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        getSignOfNumber(num);
    }
    public static void getSignOfNumber (int num){
        if (num < 0){
            System.out.printf("The number %d is negative.", num);
        } else if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        }else {
            System.out.printf("The number %d is zero.", num);
        }
    }
}
