package Codeforces;

import java.util.Scanner;

public class Ne_smeshite_moi_podkovi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        int s4 = scanner.nextInt();
        int n = 3;
        if (s1 != s2 && s1 != s3 && s1 != s4) {
            n--;
        }
        if (s2 != s3 && s2 != s4) {
            n--;
        }
        if (s3 != s4) {
            n--;
        }
        System.out.println(n);
    }
}