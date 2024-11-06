package Codeforces;

import java.util.Scanner;

public class Special_rearrangement_G {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if (n==4) System.out.println("3 1 4 2 ");
            else if (n==2||n==3) System.out.println(-1);
            else {
                for (int i=1;i<=n;i+=2) System.out.print(i+" ");
                System.out.print((n-4+n%2)+" "+(n-n%2)+" ");
                if (n%2==0) System.out.print((n-2)+" ");
                for (int i=(n-4+n%2)-2;i>1;i-=2)System.out.print(i+" ");
                System.out.println();
            }
        }
    }
}
