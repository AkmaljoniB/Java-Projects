package Codeforces;

import java.util.*;

public class Painting_the_tape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0;
            int[]arr=new int[n];
            arr[0]=sc.nextInt();
            for(int i=1;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]!=arr[0])l++;
            }
            if(l==0)System.out.println(-1);
            else{
                int min=n,k=0;
                for(int i=0;i<n;i++){
                    if(arr[i]==arr[0])k++;
                    else{
                        min=Math.min(min,k);
                        k=0;
                    }
                }
                System.out.println(Math.min(min,k));
            }
        }
    }
}