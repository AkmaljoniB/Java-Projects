package Codeforces;

import java.util.Scanner;

public class Array_construction{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<y;i++){
                if(i%2==y%2)sb.append("-1 ");
                else sb.append("1 ");
            }
            sb.append("1 ".repeat(x-y));
            for(int i=0;i<n-x;i++){
                if(i%2==0)sb.append("-1 ");
                else sb.append("1 ");
            }
            System.out.println(sb);
        }
    }
}