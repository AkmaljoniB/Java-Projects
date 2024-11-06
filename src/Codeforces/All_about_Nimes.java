package Codeforces;

import java.util.*;

public class All_about_Nimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0;
            Integer[]arr=new Integer[n+1];
            arr[0]=0;
            for(int i=1;i<=n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            if(arr[1]==1)for(int i=1;i<=n;i++){
                if(arr[i]-arr[i-1]==1)l++;
                else if(arr[i]-arr[i-1]>1)break;
            }
            System.out.println(arr[1]==1&&((l%2==0&&arr[n]==l)||(l%2!=0&&arr[n]!=l))?"Bob":"Alice");
        }
    }
}
