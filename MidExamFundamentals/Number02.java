package MidExamFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Number02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Finish")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command){
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                    break;
                case "Replace":
                    int numToReplace = Integer.parseInt(tokens[1]);
                    int replacement = Integer.parseInt(tokens[2]);
                    int index = numbers.indexOf(numToReplace);
                    if (numbers.contains(numToReplace)){
                        numbers.set(index, replacement);
                    }
                    break;
                case "Collapse":
                    int numberToCollapse = Integer.parseInt(tokens[1]);
                    for (int i = 0; i <= numbers.size()-1; i++) {
                        int number = numbers.get(i);
                        if (number < numberToCollapse){
                            numbers.remove(Integer.valueOf(number));
                            i = 0;
                        }
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int item : numbers) {
            System.out.print(item + " ");
        }

    }
}
