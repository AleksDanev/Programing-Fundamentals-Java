package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> trainList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine()); //макс брой пасажери във всеки един вагон

        String command = scanner.nextLine();
        while(!command.equals("end")) {
            //"Add {passengers}" -> ["Add", "5"]
            //"{passengers}" -> ["45"]
            String[] commandData = command.split(" ");//["Add", "5"] или ["45"]
            if (commandData[0].equals("Add")) {
                //команда Add
                int passengers = Integer.parseInt(commandData[1]);
                trainList.add(passengers);
            } else {
                //команда -> число
                int passengersToAdd = Integer.parseInt(commandData[0]);
                for(int index = 0; index < trainList.size(); index++) {
                    int currentWagon = trainList.get(index);
                    if(currentWagon + passengersToAdd <= maxCapacity) {
                        trainList.set(index, currentWagon + passengersToAdd);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int wagon : trainList) {
            System.out.print(wagon + " ");
        }


    }
}
