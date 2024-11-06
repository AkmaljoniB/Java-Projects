package Codeforces;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Row {
    public static void main(String[] args) {
        PrintWriter pr=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long sum=0;
            String s=sc.next();
            int[]arr=new int[n];
            for (int i=0;i<s.length(); i++) {
                if (s.charAt(i)=='L'){
                    sum+=i;
                    arr[i]=s.length()-1-i-i;
                }else {
                    sum+=s.length()-1-i;
                    arr[i]= i-(s.length()-1-i);
                }
            }
            Arrays.sort(arr);
            for (int i=n-1;i>=0;i--){
                if (arr[i]>0) sum+=arr[i];
                pr.print(sum+" ");
            }
            pr.println();
        }
        pr.close();
    }
}