package Codeforces;

import java.util.Scanner;

public class Achieve_equality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String a = scanner.next();
        String b = scanner.next();
        int k = n - b.replace("1", "").length();
        for (int i = 0; i < n; i++) {
            if (!a.substring(i, i + 1).equals(b.substring(i, i + 1))) {
                if (a.charAt(i) == '1' && i!=n-1 &&b.charAt(i + 1) != '1') k++;
            }
            if (a.charAt(i) == b.charAt(i) && a.charAt(i) == '1') k--;
        }
        System.out.println(k);
    }
}
