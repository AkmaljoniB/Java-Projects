package Codeforces;

import java.util.Scanner;

public class Separating_candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),max=(n/k+0.5)*k<=n?(int) ((n/k+0.5)*k):n;
            System.out.println(max);
        }
    }
}