package Codeforces;

import java.util.*;

public class Kosuke_s_Quest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,arr[]=new int[n+1];
            long[]num=new long[n+1];
            for(int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
                num[i]=num[i-1]+arr[i];
                if(arr[i]==0&&l==i-1)l++;
            }
            Set<Long>set=new HashSet<>();
            long s=0;
            for(int i=l+1;i<=n;i++){
                s+=arr[i];
                if(set.contains(num[i])||s==0){
                    l++;
                    s=0;
                    set=new HashSet<>();
                }else set.add(num[i]);
            }
            System.out.println(l);
        }
    }
}