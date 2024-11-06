package Codeforces;

import java.util.Scanner;

public class Divide_the_multiset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            System.out.println((n-1)%(k-1)==0?(n-1)/(k-1):(n-1)/(k-1)+1);
        }
    }
}