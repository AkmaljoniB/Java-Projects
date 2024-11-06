package Codeforces;

import java.util.Scanner;

public class Work_week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)System.out.println((sc.nextInt()-3)/3-1);
    }
}