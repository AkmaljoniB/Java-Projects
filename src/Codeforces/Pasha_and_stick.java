package Codeforces;

import java.util.Scanner;

public class Pasha_and_stick {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n%2==0?(n-2)/4:0);
    }
}