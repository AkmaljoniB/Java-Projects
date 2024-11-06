package Codeforces;

import java.util.Scanner;

public class Compote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(Math.min(sc.nextInt(),Math.min(sc.nextInt()/2,sc.nextInt()/4))*7);
    }
}