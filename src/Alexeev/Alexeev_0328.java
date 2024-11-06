package Alexeev;

import java.util.Scanner;

public class Alexeev_0328 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0;
        for (int i=0;i<=n;i++)s+=(n+i)*(n-i+1)/2+(n-i+1)*i;
        System.out.println(s);
    }
}
