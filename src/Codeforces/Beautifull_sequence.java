package Codeforces;

import java.util.Scanner;

public class Beautifull_sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s="NO";
            for (int i=1;i<=n;i++){
                int a=sc.nextInt();
                if (i>=a)s="YES";
            }
            System.out.println(s);
        }
    }
}