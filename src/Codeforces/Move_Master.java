package Codeforces;

import java.util.Scanner;

public class Move_Master {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
            if (c==d&&a<b||b>d||a+d-b<c) System.out.println(-1);
            else System.out.println(d-b+(Math.abs(c-(a+d-b))));
        }
    }
}