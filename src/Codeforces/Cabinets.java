package Codeforces;

import java.util.Scanner;

public class Cabinets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=0,p=0;
        for (int i=0;i<n;i++){
            int l=sc.nextInt(),r=sc.nextInt();
            if (l==1)k++;
            if (r==1)p++;
        }
        System.out.println(Math.min(k,n-k)+Math.min(p,n-p));
    }
}
