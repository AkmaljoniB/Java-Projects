package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class Missing_balance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter pr=new PrintWriter(System.out);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Integer[]arr=new Integer[n];
            for (int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            for (int i=0;i<n/2;i++) System.out.println(arr[n-1-i]+" "+arr[0]);
        }
        pr.close();
    }
}