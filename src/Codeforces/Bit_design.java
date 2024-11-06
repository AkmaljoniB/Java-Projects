package Codeforces;

import java.util.Scanner;

public class Bit_design {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),l=1;
            while(l*2-1<=k)l*=2;
            l--;
            System.out.print(n>1?l+" "+(k-l):k);
            for(int i=2;i<n;i++)System.out.print(" 0");
            System.out.println();
        }
    }
}