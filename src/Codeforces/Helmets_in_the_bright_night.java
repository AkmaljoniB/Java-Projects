package Codeforces;

import java.util.*;

public class Helmets_in_the_bright_night{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),p=sc.nextInt(),l=n-1;
            long s=p;
            int[][]arr=new int[n][2];
            for(int i=0;i<n;i++)arr[i][0]=sc.nextInt();
            for(int i=0;i<n;i++)arr[i][1]=sc.nextInt();
            Arrays.sort(arr,Comparator.comparingInt(a->a[1]));
            for(int i=0;i<n;i++){
                if(arr[i][1]<p&&l!=0){
                    l-=arr[i][0];
                    if(l>0)s+=(long)arr[i][1]*arr[i][0];
                    else{
                        s+=(long)arr[i][1]*(arr[i][0]+l);
                        l=0;
                        break;
                    }
                }
            }
            System.out.println(s+(long)l*p);
        }
    }
}
