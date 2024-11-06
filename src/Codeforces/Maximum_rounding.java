package Codeforces;

import java.util.Scanner;

public class Maximum_rounding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s="0"+sc.next();
            char[]arr=s.toCharArray();
            int l=arr.length;
            for (int i=s.length()-1;i>0;i--) {
                if (arr[i]>'4'){
                    arr[i-1]++;
                    arr[i]='0';
                    l=i;
                }
            }
            if (arr[0]!='0') System.out.print(arr[0]);
            for (int i=1;i<arr.length; i++) {
                if (i>l) System.out.print(0);
                else System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}