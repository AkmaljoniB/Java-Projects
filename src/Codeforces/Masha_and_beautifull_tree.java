package Codeforces;

import java.util.Scanner;

public class Masha_and_beautifull_tree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int m=sc.nextInt(),l=0;
            int[]arr=new int[m+1],num=new int[m+1];
            for(int i=1;i<=m;i++){
                arr[i]=sc.nextInt();
                num[arr[i]]=i;
            }
            out:for(int i=2;i<=m/2;i*=2){
                int min=m,max=1;
                for(int j=1;j<=m;j++){
                    min=Math.min(min,arr[j]);
                    max=Math.max(max,arr[j]);
                    if(j%i==0){
                        if(max-min!=i-1){
                            l=-1;
                            break out;
                        }
                        min=m;
                        max=1;
                    }
                }
            }
            if(l==0){
                for(int i=1;i<=m;i++){
                    if(num[i]!=i){
                        for(int j=m/2;j>0;j/=2){
                            if(num[i]>j&&num[i]-j>=i){
                                for(int q=i;q<i+j*2;q++){
                                    if(q<i+j)num[q]-=j;
                                    else num[q]+=j;
                                }
                                l++;
                            }
                        }
                    }
                }
            }
            System.out.println(l);
        }
    }
}