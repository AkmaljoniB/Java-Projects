package Alexeev;

import java.util.Scanner;

public class Alexeev_0792 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int p1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int p2 = scanner.nextInt();
        String s1 = Integer.toString(n1, p1);
        String s2 = Integer.toString(n2, p2);
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a') sum1 += 10;
            else if (s1.charAt(i) == 'b') sum1 +=11;
            else if (s1.charAt(i) == 'c') sum1 += 12;
            else if (s1.charAt(i) == 'd') sum1 += 13;
            else if (s1.charAt(i) == 'e') sum1 += 14;
            else if (s1.charAt(i) == 'f') sum1 += 15;
            else sum1 += Integer.parseInt(s1.substring(i, i + 1));
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'a') sum2 += 10;
            else if (s2.charAt(i) == 'b') sum2 += 11;
            else if (s2.charAt(i) == 'c') sum2 += 12;
            else if (s2.charAt(i) == 'd') sum2 += 13;
            else if (s2.charAt(i) == 'e') sum2 += 14;
            else if (s2.charAt(i) == 'f') sum2 += 15;
            else sum2 += Integer.parseInt(s2.substring(i, i + 1));
        }
        if (sum1 == sum2) System.out.println(sum1);
        else System.out.println(0);
    }
}