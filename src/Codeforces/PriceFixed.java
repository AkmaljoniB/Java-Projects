package Codeforces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PriceFixed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[][]arr=new long[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        Arrays.sort(arr, Comparator.comparingLong(a->a[1]));
        int i=n;
        long l=0,min=arr[0][1],p;
        while(--i>0){
            long f=Math.min(arr[i][0],min);
            l+=f;
            arr[i][0]-=f;
            min-=f;
            if(min==0)break;
        }
        p=l;
        l*=2;
        for(int j=0;j<=i;j++){
            if(p>=arr[j][1])l+=arr[j][0];
            else{
                min=arr[j][1]-p;
                while(true){
                    long f=Math.min(arr[i][0],min);
                    l+=f*2;
                    arr[i][0]-=f;
                    min-=f;
                    if(min==0)break;
                    i--;
                }
                l+=arr[j][0];
            }
            p+=arr[j][0];
        }
        System.out.println(l);
    }
}