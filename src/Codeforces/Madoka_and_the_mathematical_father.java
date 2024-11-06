package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class Madoka_and_the_mathematical_father {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pr =new PrintWriter(System.out);
        for (int t = sc.nextInt(); t-- > 0; ) {
            int n = sc.nextInt();
            if ((n - 1) % 3 == 0) {
                for (int i = 0; i < n/3; i++) pr.print("12");
                pr.print("1");
            } else {
                for (int i = 0; i < n / 3; i++) pr.print("21");
                if (n % 3 != 0) pr.print("2");
            }
            pr.println();
        }
        pr.close();
    }
}
