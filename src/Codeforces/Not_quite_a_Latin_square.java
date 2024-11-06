package Codeforces;

import java.util.Scanner;

public class Not_quite_a_Latin_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next(),s2=sc.next(),s3=sc.next();
            if (s1.contains("?")) s3 = s1;
            else if (s2.contains("?")) s3 = s2;
            if (!s3.contains("A")) System.out.println("A");
            else if (!s3.contains("B")) System.out.println("B");
            else System.out.println("C");
        }
    }
}