package Codeforces;

import java.util.Scanner;

public class Ideal_point {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),o=0,p=0;
            for (int i=0;i<n; i++) {
                int l=sc.nextInt(),r=sc.nextInt();
                if (l==k)o++;
                if (r==k)p++;
            }
            System.out.println(o!=0 &&p!=0?"YES":"NO");
        }
    }
}