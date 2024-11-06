package Codeforces;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(),L=sc.nextInt(),a=sc.nextInt(),k=0,q=0;
        for (int i=0;i<n;i++){
            int t=sc.nextInt(),l=sc.nextInt();
            k+=(t-q)/a;
            q=t+l;
        }
        System.out.println(k+(L-q)/a);
    }
}
