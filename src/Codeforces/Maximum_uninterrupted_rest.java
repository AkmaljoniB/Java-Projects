package Codeforces;

import java.util.Scanner;

public class Maximum_uninterrupted_rest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l1=-1,max=0,k=0;
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            if (a==1)k++;
            else {
                if (l1==-1)l1=k;
                max=Math.max(max,k);
                k=0;
            }
        }
        max=Math.max(max,k);
        System.out.println(Math.max(max,l1+k));
    }
}