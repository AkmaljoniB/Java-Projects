package Codeforces;

import java.util.Scanner;

public class Refrigerator_locks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),s=0;
            String sb="";
            for(int i=1;i<=n;i++){
                int a=sc.nextInt();
                s+=a*2;
                sb=sb+i+" "+(i+1)+"\n";
            }
            System.out.println(n<3||m<n?-1:s+"\n"+sb.substring(0,sb.lastIndexOf(" "))+" 1");
        }
    }
}