package Alexeev;

import java.util.Scanner;

public class Alexeev_0504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = "GCV";
        String p,t ;
        for (int i = 1; i <= n; i++) {
            p = s.substring(0, 1).concat(s.substring(2, 3)).concat(s.substring(1, 2));
            t = p.substring(2,3);
            p = p.substring(1,2).concat(s.substring(0,1)).concat(t);
            s=p;
        }
        System.out.println(s);
    }
}
