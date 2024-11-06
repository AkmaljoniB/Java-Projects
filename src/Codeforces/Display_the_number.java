package Codeforces;

import java.util.Scanner;

public class Display_the_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int t=sc.nextInt();t-->0;){
            int n=sc.nextInt();
            if(n%2!=0){
                n=n-3;
                System.out.print(7);
            }
            for(int i=0;i<n/2;i++)System.out.print(1);
            System.out.println();
        }
    }
}
