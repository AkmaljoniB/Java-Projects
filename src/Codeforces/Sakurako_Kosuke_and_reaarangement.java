package Codeforces;

import java.util.*;

public class Sakurako_Kosuke_and_reaarangement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0;
            int[]arr=new int[n+1],num=new int[n+1];
            for(int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
                num[arr[i]]=i;
            }
            for(int i=1;i<=n;i++){
                if(i!=arr[arr[i]]){
                    l++;
                    arr[num[i]]=arr[arr[i]];
                    num[arr[arr[i]]]=num[i];
                    arr[arr[i]]=i;
                }
            }
            System.out.println(l);
        }
    }
}