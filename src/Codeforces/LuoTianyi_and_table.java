package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class LuoTianyi_and_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            int[]arr=new int[n*m];
            for(int i=0;i<n*m;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            System.out.println((arr[n*m-1]-arr[0])*(n*m-2)+(arr[n*m-2]-arr[0]));
        }
    }
}
