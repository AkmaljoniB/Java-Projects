package Codeforces;

import java.util.Scanner;

public class Drazil_and_date{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=Math.abs(sc.nextInt()),b=Math.abs(sc.nextInt()),s=sc.nextInt();
        System.out.println((a+b)<=s&&((a+b)-s)%2==0?"Yes":"No");
    }
}