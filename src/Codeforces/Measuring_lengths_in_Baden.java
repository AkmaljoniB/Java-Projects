package Codeforces;

import java.util.Scanner;

public class Measuring_lengths_in_Baden{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%36==35)n++;
        int l=n%36%3==2?1:0;
        System.out.println(n/36 +" "+(n%36/3+l));
    }
}