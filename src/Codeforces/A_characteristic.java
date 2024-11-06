package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class A_characteristic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=0;
            Integer[]arr=new Integer[n+2];
            long s=0;
            for (int i=0;i<n+2;i++){
                arr[i]=sc.nextInt();
                s+=arr[i];
            }
            StringBuilder sb=new StringBuilder();
            Arrays.sort(arr);
            s-=arr[n+1];
            for (int i=0;i<n+1; i++) {
                if (k==0 &&s-arr[i]==arr[n+1])k=1;
                else sb.append(arr[i]+" ");
            }
            if (k!=1 &&s-arr[n]==arr[n]){
                k=1;
                String p= String.valueOf(sb);
                p=p.substring(0,p.length()-1);
                p=p.substring(0,p.lastIndexOf(" "));
                sb=new StringBuilder(p);
            }
            System.out.println(k==1?sb:-1);
        }
    }
}