package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commandArr = input.split("\\s+");
            String command = commandArr[0];
            switch (command){
                case "Contains":
                    int number = Integer.parseInt(commandArr[1]);
                    if (numbersList.contains(number)){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String secondCommand = commandArr[1];
                    if (secondCommand.equals("even")){
                        for (int num:numbersList) {
                            if (num % 2 == 0){
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();
                    }else if (secondCommand.equals("odd")){
                        for (int num:numbersList) {
                            if (num % 2 != 0){
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int num:numbersList) {
                        sum = sum + num;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = commandArr[1];
                    int num = Integer.parseInt(commandArr[2]);
                    switch (condition){
                        case "<":
                            for (int item: numbersList) {
                                if (item < num){
                                    System.out.print(item + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int item: numbersList){
                                if (item > num){
                                    System.out.print(item + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int item:numbersList){
                                if (item >= num){
                                    System.out.print(item + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int item:numbersList){
                                if (item <= num){
                                    System.out.print(item + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }

            input = scanner.nextLine();
        }

    }
}
