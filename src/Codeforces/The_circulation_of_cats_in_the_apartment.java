package Codeforces;

import java.util.Scanner;

public class The_circulation_of_cats_in_the_apartment{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            System.out.println(n%2==0?k%n==0?n:k%n:(k+(k-1)/(n/2))%n==0?n:(k+(k-1)/(n/2))%n);
        }
    }
}