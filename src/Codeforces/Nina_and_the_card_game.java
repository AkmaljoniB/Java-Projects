package Codeforces;

import java.util.Scanner;

public class Nina_and_the_card_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=n,l=0;
            int[]arr=new int[n+1];
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(arr[a]==0)k--;
                if(arr[a]==1)l++;
                arr[a]++;
            }
            System.out.println(k>=l?l:n-k);
        }
    }
}