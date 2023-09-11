package __RoughPractice__.HackerEarthPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumOfInputArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        String[] arr = new String[]{"23","45","56"};
        long[] intarr = Arrays.stream(arr).mapToLong(a -> Long.valueOf(a)).toArray();
        //List<Long> intarr1 = Arrays.stream(arr).mapToLong(a -> Long.valueOf(a)).collect(Collectors.toList());
        System.out.println(intarr[1]);


    }
}
