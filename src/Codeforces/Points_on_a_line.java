package Codeforces;

import java.util.Scanner;

public class Points_on_a_line{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),d=sc.nextInt(),arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int i=0,j=0,p=1;
        long k=0,f=0;
        while(j<n){
            if(arr[j]-arr[i]<=d){
                j++;
                if(j-i>2){
                    k+=f+p;
                    f+=p;
                    p++;
                }
            }else{
                while(arr[j]-arr[i]>d){
                    i++;
                    if(p!=1){
                        p--;
                        f-=p;
                    }
                }
            }
        }
        System.out.println(k);
    }
}