package For_and_Array;

import java.util.Arrays;
import java.util.Scanner;

public class For_and_Array7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Razmer Massive ");
        int n = scanner.nextInt();
        int num = 0;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println();

        int max_el = 1;
        int frq = 0;

        for (int i = 0; i < arr.length; i++) {
            frq = 1;

            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    frq += 1;
                }
                if (frq > max_el) {
                    max_el = frq;
                    num = arr[i];
                }
            }
        }
        if (max_el > 1) {
            System.out.println(max_el + " раза встречается число " + num);
        } else {
            System.out.println(" Все элементи уникальим ");
        }
    }
}
