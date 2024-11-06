package Random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Right_Shift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(Arrays.toString(shift(random(n), m)));
    }

    public static int[] random(int n) {
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(24) - 12;
        }
        return array;
    }

    public static int[] shift(int[] array, int n) {
        int[] arr = new int[array.length];
        for (int i = 0; i < n; i++) {
            arr[i] = array[array.length - n + i];
        }
        for (int i = 0; i < array.length - n; i++) {
            arr[i + n] = array[i];
        }
        System.out.println(Arrays.toString(array));
        return arr;
    }
}