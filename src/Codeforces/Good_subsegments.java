package Codeforces;

import java.util.Scanner;

public class Good_subsegments{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=0;
            int[]arr=new int[n+1],num=new int[n+1];
            String s=sc.next();
            for(int i=1;i<=n;i++){
                arr[i]=s.charAt(i-1)-'0';
                num[i]=num[i-1]+arr[i];
            }
            for(int i=n;i>=1;i--){
                if(i-arr[i]>=0&&num[i]-num[i-arr[i]]==arr[i])k++;
            }
            System.out.println(k);
        }
    }
}