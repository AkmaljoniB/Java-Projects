package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Basketball_Together {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),d=sc.nextInt(),k=0,l=n;
        Integer[]arr=new Integer[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        out:for(int i=n-1;i>=0;i--){
            int j=1;
            while(j<=l){
                long a=arr[i];
                if(a*j>d){
                    l-=j;
                    k++;
                    break;
                }
                if(a*l<=d)break out;
                j++;
            }
        }
        System.out.println(k);
    }
}