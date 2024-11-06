package Codeforces;

import java.util.Scanner;

public class Pathetic_rearrangement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),i=2;
            if (n%2!=0){
                System.out.print("1 ");
                i++;
            }
            for (;i<=n; i+=2) System.out.print(i+" "+(i-1)+" ");
            System.out.println();
        }
    }
}
