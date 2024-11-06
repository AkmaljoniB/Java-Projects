package Codeforces;

import java.util.Scanner;

public class Squaring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long k=0;
            int[]arr=new int[n],num=new int[n];
            arr[0]=sc.nextInt();
            for(int i=1;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]<arr[i-1]&&arr[i]==1)k=-1;
                if(k!=-1){
                    if(num[i-1]!=0&&arr[i]>arr[i-1]){
                        long l=arr[i-1];
                        int p=num[i-1];
                        while(l<arr[i]&&p>0){
                            l*=l;
                            p--;
                        }
                        if(l==arr[i])num[i]=p;
                        else if(l>arr[i])num[i]=p+1;
                        k+=num[i];
                    }else if(arr[i]<=arr[i-1]){
                        int l=arr[i-1];
                        while(l>arr[i]){
                            if((int)Math.sqrt(l)*(int)Math.sqrt(l)!=l)l=(int)Math.sqrt(l)+1;
                            else l=(int)Math.sqrt(l);
                            num[i]++;
                        }
                        num[i]+=num[i-1];
                        k+=num[i];
                    }
                }
            }
            System.out.println(k);
        }
    }
}