package MidExamFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> buyList =
                Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String phone = tokens[1];

            switch (command) {
                case "Add":
                    if (!buyList.contains(phone)){
                        buyList.add(phone);
                    }
                    break;
                case "Remove":
                    if (buyList.contains(phone)){
                        buyList.remove(phone);
                    }
                    break;
                case "Bonus phone":
                    String[] phones = phone.split(":");
                    String oldPhone = phones[0];
                    String newPhone = phones[1];
                    if (buyList.contains(oldPhone)){
                        buyList.add(buyList.indexOf(oldPhone)+1, newPhone);
                    }
                    break;
                case "Last":
                    if (buyList.contains(phone)){
                        int phoneIndex = buyList.indexOf(phone);
                        String addPhone = phone;
                        buyList.remove(phoneIndex);
                        buyList.add(addPhone);
                    }
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", buyList));

    }
}
