package Codingbat.Array_2;

import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz(1, 6)));
    }

    public static String[] fizzBuzz(int start, int end) {
        String[] arr = new String[end - start];
        for (int j =0; j< arr.length;j++) {
            for (int i = start+j; i < end; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    arr[j] = "FizzBuzz";
                    break;
                } else if (i % 3 == 0) {
                    arr[j] = "Fizz";
                    break;
                } else if (i % 5 == 0) {
                    arr[j] = "Buzz";
                    break;
                } else {
                    arr[j] = String.valueOf(i);
                    break;
                }
            }
        }
        return arr;
    }
}
