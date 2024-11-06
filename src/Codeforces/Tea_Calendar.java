package Codeforces;

import java.util.Scanner;

public class Tea_Calendar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),a=sc.nextInt();
            for (int i=1;i<n;i++){
                int b=sc.nextInt();
                if (a>=b) b=((a-b)/b+2)*b;
                a=b;
            }
            System.out.println(a);
        }
    }
}