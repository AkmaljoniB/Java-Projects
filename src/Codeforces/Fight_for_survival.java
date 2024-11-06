package Codeforces;

import java.util.Scanner;

public class Fight_for_survival {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long s=0;
            for(int i=0;i<n-2;i++)s+=sc.nextInt();
            s=sc.nextInt()-s;
            System.out.println(sc.nextInt()-s);
        }
    }
}