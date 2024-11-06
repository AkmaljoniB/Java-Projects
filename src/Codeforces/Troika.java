package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Troika {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,r=0,p=0;
            int[]arr=new int[n+1];
            for(int i=1;i<=n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            for(int i=2;i<=n;i++){
                arr[i]+=arr[i-1];
                if(i!=n&&arr[i]-arr[i-2]<=arr[n]){
                    l++;
                    p=i;
                }
            }
            for(int i=n;i>0;i--){
                if(arr[i]-arr[i-1]>=arr[2]){
                    r++;
                    for(int j=p;j>1;j--){
                        if(arr[j]-arr[j-2]<=arr[i-1]-arr[i-2]){
                            l=Math.min(l,r+j-1);
                            p=j+1;
                            break;
                        }
                    }
                }else break;
            }
            System.out.println(Math.min(l,r));
        }
    }
}