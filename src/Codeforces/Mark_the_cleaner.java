package Codeforces;

import java.util.Scanner;

public class Mark_the_cleaner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();long l=0;
            for (int i=1;i<n;i++){
                int a=sc.nextInt();
                if (a>0)l+=a;
                if (l>0 &&a==0)l++;
            }
            sc.nextInt();
            System.out.println(l);
        }
    }
}