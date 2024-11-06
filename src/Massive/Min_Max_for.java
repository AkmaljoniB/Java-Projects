package Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Min_Max_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int min = 0;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = i;
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(min);
        System.out.println(max);
    }
}