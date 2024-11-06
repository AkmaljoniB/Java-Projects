package Codeforces;

import java.util.Scanner;

public class Peter_and_the_combination_lock {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=1,k=0;
        int[]arr=new int[n],num=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        String res="NO";
        while(l<=n){
            int s=0;
            for(int i=0;i<n;i++){
                if(num[i]==0)s+=arr[i];
                else s-=arr[i];
            }
            if(s%360==0){
                res="YES";
                break;
            }
            if(k==0){
                for(int i=0;i<l;i++)num[i]=1;
                k=1;
                l++;
            }else{
                int p=0;
                for(int i=n-1;i>=0;i--){
                    if(num[i]==1){
                        if(i!=n-1&&num[i+1]!=1){
                            if(num[n-1]==1){
                                int q=0;
                                for(int e=n-1;e>=0;e--){
                                    if(num[e]==1){
                                        num[e]=0;
                                        q++;
                                    }else break;
                                }
                                for(int j=i+1;j<=i+1+q;j++)num[j]=1;
                            }else num[i+1]=1;
                            num[i]=0;
                            p=1;
                            break;
                        }
                    }
                }
                if(p==0){
                    num=new int[n];
                    k=0;
                }
            }
        }
        System.out.println(res);
    }
}