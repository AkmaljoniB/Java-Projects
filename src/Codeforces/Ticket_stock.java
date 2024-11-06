package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Ticket_stock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
            long s=0;
            Integer[]arr=new Integer[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                int l=Math.min(k,m);
                s+=(arr[i]+(long)m*i)*l;
                k-=l;
                if(k==0)break;
            }
            System.out.println(s);
        }
    }
}