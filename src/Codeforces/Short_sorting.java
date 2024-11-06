package Codeforces;

import java.util.Scanner;

public class Short_sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            if (s.equals("cab") || s.equals("bca")) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
