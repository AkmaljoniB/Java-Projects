package Codeforces;

import java.util.Scanner;

public class Almost_equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=n,l=0,i=1;
        if(n%2==0) System.out.println("NO");
        else {
            n*=2;
            int r=n;
            int[]arr=new int[n];
            for(;k*l<n;l++)arr[k*l]=l+1;
            while(l<r){
                if(i%2!=0){
                    for(int p=i;p<n;p+=k){
                        arr[p]=r;
                        r--;
                    }
                }else{
                    for(int p=n-(n-i-1)%k-1;p>=i;p-=k){
                        arr[p]=r;
                        r--;
                    }
                }
                i++;
            }
            System.out.println("YES");
            for(int p=0;p<n;p++)System.out.print(arr[p]+" ");
        }
    }
}