package Codeforces;

import java.util.Scanner;

public class Nina_s_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int k=sc.nextInt(),q=sc.nextInt(),min=Integer.MAX_VALUE;
            for(int i=0;i<k;i++)min=Math.min(min,sc.nextInt());
            while(q-->0)System.out.print(Math.min(min-1,sc.nextInt())+" ");
            System.out.println();
        }
    }
}