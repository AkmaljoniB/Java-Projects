package Codeforces;

import java.util.Scanner;

public class Slip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextInt(),m=sc.nextInt(),r=sc.nextInt(),c=sc.nextInt();
            System.out.println((n-r)*m+m-c+(n-r)*(m-1));
        }
    }
}