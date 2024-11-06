package Codeforces;

import java.util.Scanner;

public class Make_it_ugly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt(),l=n%m!=0?1:0;
            System.out.println(m!=1&&n-(n/m)-l>k?"YES":"NO");
        }
    }
}