package Codeforces;

import java.util.Scanner;

public class Cardboard_for_pictures {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),w=0;
            long c=sc.nextLong();
            int[]arr=new int[n];
            for (int i=0;i<n;i++)arr[i]=sc.nextInt();
            while(true){
                w++;
                long s=0;
                for(int i=0;i<n;i++)s+=Math.pow(arr[i]+w*2,2);
                if (s==c)break;
            }
            System.out.println(w);
        }
    }
}