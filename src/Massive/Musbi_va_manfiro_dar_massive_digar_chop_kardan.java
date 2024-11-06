package Massive;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Musbi_va_manfiro_dar_massive_digar_chop_kardan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > 0) {
                arr1[i] = arr[i];
            }
            if (arr[i] < 0) {
                arr2[i] = arr[i];
            }
        }
        arr1 = Arrays.stream(arr1).filter(i -> i != 0).toArray();
        arr2 = Arrays.stream(arr2).filter(i -> i != 0).toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("manfi" + Arrays.toString(arr1));
        System.out.println("musbi: " + Arrays.toString(arr2));
    }
}
