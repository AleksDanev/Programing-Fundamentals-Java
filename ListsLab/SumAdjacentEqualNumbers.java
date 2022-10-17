package ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split("\\s"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() -1; i++) {
            double currentNumber = numbersList.get(i);
            double nextNumber = numbersList.get(i + 1);
            if (currentNumber == nextNumber){
                numbersList.set(i, currentNumber+nextNumber);
                numbersList.remove(nextNumber);
                i = -1;
            }

        }

        System.out.println(joinElementsByDelimiter(numbersList, " "));
    }

    public static String joinElementsByDelimiter (List<Double> list, String delimiter){
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item : list) {
            String numDf = df.format(item) + delimiter;
            result = result + numDf;
        }
        return result;
    }
}
