package Codeforces;

import java.util.Scanner;

public class Crazy_computer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=sc.nextInt(),a=sc.nextInt(),k=1;
        for (int i=1;i<n;i++) {
            int b=sc.nextInt();
            if (b-a>c)k=1;
            else k++;
            a=b;
        }
        System.out.println(k);
    }
}