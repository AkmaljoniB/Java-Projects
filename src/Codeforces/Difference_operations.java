package Codeforces;

import java.util.Scanner;

public class Difference_operations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),a=sc.nextInt();
            String s="YES";
            for (int i=1;i<n;i++)if (sc.nextInt()%a!=0)s="NO";
            System.out.println(s);
        }
    }
}