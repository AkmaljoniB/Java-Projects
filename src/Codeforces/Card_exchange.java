package Codeforces;

import java.util.*;

public class Card_exchange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            int[]arr=new int[101];
            for(int i=0;i<n;i++)arr[sc.nextInt()]++;
            Arrays.sort(arr);
            System.out.println(arr[100]>=k?k-1:n);
        }
    }
}