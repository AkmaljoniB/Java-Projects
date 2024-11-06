package Codeforces;

import java.util.Scanner;

public class Teacher_Dalton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k =0;
            for (int i = 1; i <= n; i++) {
                int a = scanner.nextInt();
                if (a==i)k++;
            }
            System.out.println(k/2+k%2);
        }
    }
}
