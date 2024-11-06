package Codeforces;

import java.util.Scanner;

public class Add_pros_and_cons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int l = 0;
            if (s.charAt(0) == '1') l++;
            for (int i = 1; i < n; i++) {
                if (s.startsWith("0", i)) System.out.print("+");
                else if (s.startsWith("1", i)) {
                    if (l == 0) {
                        System.out.print("+");
                        l++;
                    } else {
                        System.out.print("-");
                        l--;
                    }
                }
            }
            System.out.println();
        }
    }
}
