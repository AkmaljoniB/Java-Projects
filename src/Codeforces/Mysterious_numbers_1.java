package Codeforces;

import java.util.Scanner;

public class Mysterious_numbers_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        StringBuilder sb=new StringBuilder(sc.next());
        sb.reverse();
        System.out.println(a+Integer.parseInt(sb+""));
    }
}