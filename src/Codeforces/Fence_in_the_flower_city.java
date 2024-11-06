package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Fence_in_the_flower_city{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n],a[]=new int[n],j=n-1;
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            a[0]=n;
            for(int i=1;i<n;i++){
                int l=0;
                for(;j>=0;j--){
                    if(arr[j]<=i)l++;
                    else break;
                }
                a[i]=a[i-1]-l;
            }
            System.out.println(Arrays.equals(arr,a)?"YES":"NO");
        }
    }
}