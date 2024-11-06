package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

public class Alexeev_0519 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ars = scanner.nextLine().split("");
        Arrays.sort(ars);
        int k = 0;
        for (String ar : ars) {
            if (!ar.equals("0")) {
                System.out.print(ar);
                for (int j = 0; j < k; j++) System.out.print("0");
                k = 0;
            } else k++;
        }
        System.out.print(" ");
        for (int i = ars.length - 1; i >= 0; i--) System.out.print(ars[i]);
    }
}
