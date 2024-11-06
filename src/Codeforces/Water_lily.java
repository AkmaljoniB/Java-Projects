package Codeforces;

import java.util.Scanner;

public class Water_lily{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double h=sc.nextInt(),l=sc.nextInt();
        System.out.println((l*l-h*h)/2/h);
    }
}