package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Ready_to_Olympiad{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=sc.nextInt(),r=sc.nextInt(),x=sc.nextInt(),k=0;
        int[]arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<(1<<n);i++){
            int s=0,c=0,a=0,b=0;
            for(int j=0;j<n;j++){
                if((i&(1<<j))>0){
                    s+=arr[j];c++;
                    if(a==0) a=arr[j];
                    b=Math.max(b,arr[j]-a);
                }
            }
            if(c>=2&&l<=s&&s<=r&&b>=x)k++;
        }
    }
}