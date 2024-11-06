package Codeforces;

import java.util.Scanner;

public class Long_long {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int[]arr=new int[n];
            int k = 0,p=0;
            long s= 0;
            for (int i = 0 ; i<n;i++){
                arr[i]=scanner.nextInt();
                if (arr[i]<0)p++;
                else if (arr[i]>0 &&p!=0){
                    k++;
                    p=0;
                }
                s+=Math.abs(arr[i]);
            }
            if (p!=0)k++;
            System.out.println(s+" "+k);
        }
    }
}
