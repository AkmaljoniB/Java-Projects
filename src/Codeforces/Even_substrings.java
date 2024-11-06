package Codeforces;

import java.util.Scanner;

public class Even_substrings {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(),k=0;
        String s=sc.next();
        for (int i=0;i<n;i++)if ((s.charAt(i)-'0')%2==0)k+=i+1;
        System.out.println(k);
    }
}