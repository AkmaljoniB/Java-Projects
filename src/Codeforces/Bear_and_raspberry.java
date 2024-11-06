package Codeforces;

import java.util.Scanner;

public class Bear_and_raspberry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=sc.nextInt(),max=0,a=sc.nextInt();
        for (int i=1;i<n;i++) {
            int b=sc.nextInt();
            max=Math.max(a-b-c,max);
            a=b;
        }
        System.out.println(max);
    }
}
