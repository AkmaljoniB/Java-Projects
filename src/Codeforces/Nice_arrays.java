package Codeforces;

import java.util.Scanner;

public class Nice_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int t=sc.nextInt();t-->0;){
            int n=sc.nextInt(),k=0;
            long s=0;
            for(int i=0;i<n;i++){
               int a=sc.nextInt();
               if (a!=1)k++;
               s+=a;
            }
            s-=k;
            System.out.println(n!=1&&(k==n||s/(n-k)>1)?"YES":"NO");
        }
    }
}
