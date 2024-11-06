package Codeforces;

import java.util.Scanner;

public class Ambitious_Kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            min=Math.min(min,Math.abs(a));
        }
        System.out.println(min);
    }
}