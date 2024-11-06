package Codeforces;

import java.util.Scanner;

public class Joysticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), a2 = sc.nextInt();
        int max = Math.max(a1, a2), min = Math.min(a1, a2), k = 0;
        while (max-2 >= 0 && min > 0) {
            max -= 2;
            min++;
            int l=max;
            max=Math.max(max,min);
            min=Math.min(min,l);
            k++;
        }
        System.out.println(k);
    }
}
