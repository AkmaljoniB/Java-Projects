package Codeforces;

import java.util.*;

public class Varied_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),arr[]=new int[n*m];
            for(int j=0;j<n*m;j++)arr[j]=sc.nextInt();
            if(n*m==1)System.out.println(-1);
            else{
                for(int j=0;j<n*m-1;j++)System.out.print(arr[j+1]+" ");
                System.out.println(arr[0]);
            }
        }
    }
}