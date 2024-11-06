package Codeforces;

import java.util.Scanner;

public class Flag_Day{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[]arr=new int[n+1];
        for(int i=0;i<m;i++){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            if(arr[a]==0&&arr[b]==0&&arr[c]==0){
                arr[a]=1;
                arr[b]=2;
                arr[c]=3;
            }else{
                if(arr[a]!=0){
                    if(arr[a]==1){
                        arr[b]=2;
                        arr[c]=3;
                    }else if(arr[a]==2){
                        arr[b]=1;
                        arr[c]=3;
                    }else{
                        arr[b]=1;
                        arr[c]=2;
                    }
                }else if(arr[b]!=0){
                    if(arr[b]==1){
                        arr[a]=2;
                        arr[c]=3;
                    }else if(arr[b]==2){
                        arr[a]=1;
                        arr[c]=3;
                    }else{
                        arr[a]=1;
                        arr[c]=2;
                    }
                }else{
                    if(arr[c]==1){
                        arr[b]=2;
                        arr[a]=3;
                    }else if(arr[c]==2){
                        arr[b]=1;
                        arr[a]=3;
                    }else{
                        arr[b]=1;
                        arr[a]=2;
                    }
                }
            }
        }
        for(int i=1;i<=n;i++) System.out.print(arr[i]+" ");
    }
}
