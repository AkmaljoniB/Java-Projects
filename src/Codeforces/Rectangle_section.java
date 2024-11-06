package Codeforces;

import java.util.Scanner;

public class Rectangle_section {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt(),b=sc.nextInt();
            String s="No";
            if ((a%2==0 &&b+a/2!=a && a/2!=b)||(b%2==0 &&a+b/2!=b &&b/2!=a))s="Yes";
            System.out.println(s);
        }
    }
}
