package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Place_in_the_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0;
        int[]arr=new int[n];
        for(int i=0;i<n;i++)for(int j=0;j<4;j++)arr[i]+=sc.nextInt();
        s=arr[0];
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            if(arr[i]==s){
                System.out.print(n-i);
                break;
            }
        }
    }
}
