package Codeforces;

import java.util.Scanner;

public class Stirrer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),l=1;
            while (l<=n)l*=2;
            System.out.println(l/2);
        }
    }
}
