package Alexeev;

import java.util.Scanner;

public class Alexeev_0336 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = 1, max = 1, min = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                n++;
                max=Math.max(max,n);
            }
            if (s.charAt(i) == '2') {
                n--;
                min=Math.min(min,n);
            }
        }
        System.out.println(max-min+1);
    }
}
