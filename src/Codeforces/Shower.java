package Codeforces;

import java.util.Scanner;

public class Shower{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),s=sc.nextInt(),m=sc.nextInt(),p=0;
            String f="NO";
            for(int i=0;i<n;i++){
                int l=sc.nextInt(),r=sc.nextInt();
                if(l-p>=s)f="YES";
                if(n-1==i&&m-r>=s)f="YES";
                p=r;
            }
            System.out.println(f);
        }
    }
}