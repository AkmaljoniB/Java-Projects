package Alexeev;

import java.util.Scanner;

public class Alexeev_0383 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = 1;
        while (n > 0) {
            String s = String.valueOf(l);
            int sum = 0;
            for (int i = 0; i < s.length(); i++) sum += Integer.parseInt(s.substring(i, i + 1));
            if (sum % s.length() == 0) n--;
            l++;
        }
        System.out.println(l-1);
    }
}
