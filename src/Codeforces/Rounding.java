package Codeforces;

import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n>5)System.out.println(n%10>5?(n/10+1)+"0":(n/10)+"0");
        else System.out.println(0);
    }
}
