package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int startIndex = 0;
        int endIndex = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            int nowCount = 0;
            for (int j = i; j <array.length ; j++) {
                if (array[i]==array[j]){
                    nowCount++;
                    if (nowCount>count){
                        count=nowCount;
                        startIndex=i;
                        endIndex=j;
                    }
                }else {
                    break;
                }
            }
        }
        for (int i = startIndex; i <=endIndex ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
