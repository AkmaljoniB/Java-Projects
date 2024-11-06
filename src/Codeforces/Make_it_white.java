package Codeforces;

import java.util.Scanner;

public class Make_it_white {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=0;sc.nextInt();
            String s=sc.next();
            if (s.contains("B")) n=s.lastIndexOf("B")-s.indexOf("B")+1;
            System.out.println(n);
        }
    }
}
