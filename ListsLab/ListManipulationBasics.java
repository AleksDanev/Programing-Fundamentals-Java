package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commandArr = input.split("\\s");
            String command = commandArr[0];

            switch (command) {
                case "Add":
                    int number = Integer.parseInt(commandArr[1]);
                    numbersList.add(number);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(commandArr[1]);
                    numbersList.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(commandArr[1]);
                    numbersList.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToAdd = Integer.parseInt(commandArr[1]);
                    int index = Integer.parseInt(commandArr[2]);
                    numbersList.add(index, numberToAdd);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
