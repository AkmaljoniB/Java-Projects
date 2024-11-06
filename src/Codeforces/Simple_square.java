package Codeforces;

import java.util.Scanner;

public class Simple_square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    if (j==i||j==n-1-i||(j==i+1&&j==n-i-2)||(j==i-1&&j==n-2-i)) System.out.print("1 ");
                    else System.out.print("0 ");
                }
                System.out.println();
            }
        }
    }
}