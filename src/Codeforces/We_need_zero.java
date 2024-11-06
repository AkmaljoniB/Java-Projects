package Codeforces;

import java.util.Scanner;

public class We_need_zero{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),p=-1;
            int[]arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int j=0;j<256;j++) {
                int l=arr[0]^j;
                for(int i=1;i<n;i++)l^=arr[i]^j;
                if(l==0){
                    p=j;
                    break;
                }
            }
            System.out.println(p);
        }
    }
}