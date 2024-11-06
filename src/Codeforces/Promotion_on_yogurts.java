package Codeforces;

import java.util.Scanner;

public class Promotion_on_yogurts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
            System.out.println(Math.min(a*2,b)*(n/2)+(n%2)*a);
        }
    }
}
