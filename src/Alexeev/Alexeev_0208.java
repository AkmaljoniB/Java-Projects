package Alexeev;

import java.util.Scanner;

public class Alexeev_0208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = Integer.toBinaryString(n);
        long max = Long.parseLong(s);
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(s.length() - 1) + s.substring(0, s.length() - 1);
            max = Math.max(max,Long.parseLong(s));
        }
        s= String.valueOf(max);
        System.out.println(Integer.parseInt(s,2));
    }
}
