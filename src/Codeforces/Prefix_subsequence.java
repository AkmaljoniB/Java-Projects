package Codeforces;

import java.util.Scanner;

public class Prefix_subsequence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),j=0;
            String a=sc.next(),b=sc.next();
            for(int i=0;i<n;i++){
                int l=0;
                while(j<m&&l==0){
                    if(b.charAt(j)==a.charAt(i))l=1;
                    j++;
                }
                if(l==0){
                    n=i;
                    break;
                }
            }
            System.out.println(n);
        }
    }
}