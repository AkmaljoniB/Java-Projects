package Codeforces;

import java.util.Scanner;

public class Quick_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),l=0;
            for (int i=1;i<=n;i++)if(sc.nextInt()!=i-l)l++;
            System.out.println(l%k!=0?l/k+1:l/k);
        }
    }
}