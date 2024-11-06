package Codeforces;

import java.util.Scanner;

public class Journey_of_a_flea{
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        while(n%2==0)n/=2;
        System.out.println(n==1?"YES":"NO");
    }
}