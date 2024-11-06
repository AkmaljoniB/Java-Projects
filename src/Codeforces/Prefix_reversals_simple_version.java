package Codeforces;

import java.util.Scanner;

public class Prefix_reversals_simple_version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=0;
            String a=sc.next(),b=sc.next();
            StringBuilder sb=new StringBuilder();
            for(int j=n-1;j>=0;j--){
                if(a.charAt(j)!=b.charAt(j)){
                    if(a.charAt(0)==b.charAt(j)){
                        sb.append("1 ");
                        a=(1-(a.charAt(0)-'0'))+a.substring(1);
                        k++;
                    }
                    sb.append((j+1)+" ");
                    for(int i=0;i<=j;i++)a=a.substring(0,i)+(1-(a.charAt(i)-'0'))+a.substring(i+1);
                    StringBuilder sq= new StringBuilder(a.substring(0, j+1));
                    sq.reverse();
                    a=sq+a.substring(j+1);
                    k++;
                }
            }
            System.out.println(k+" "+sb);
        }
    }
}