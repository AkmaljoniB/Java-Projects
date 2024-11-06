package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Byte_per_package {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            String s="NO";
            if(n%2==1)s="YES";
            else{
                int l=1,j=n-1;
                for(int i=n-2;i>=0;i--){
                    if(arr[j]==arr[i])l++;
                    else if(l%2==1){
                        s="YES";
                        break;
                    }else{
                        j=i;
                        l=1;
                    }
                }
            }
            System.out.println(s);
        }
    }
}