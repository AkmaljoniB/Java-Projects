package Codeforces;

import java.util.Scanner;

public class Manhattan_reshuffle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=1,arr[]=new int[n+1];long k=sc.nextLong();
            while(k>0){
                if(k<(n-l+1-l)*2L){
                    arr[l]=(int)(l+k/2);
                    arr[(int)(l+k/2)]=l;
                    k-=k/2*2;
                    break;
                }else{
                    if(l>n/2)break;
                    arr[l]=n-l+1;
                    arr[n-l+1]=l;
                    k-=(n-l+1-l)*2L;
                    l++;
                }
            }
            if(k==0){
                System.out.println("Yes");
                for(int i=1;i<=n;i++)System.out.print(arr[i]==0?i+" ":arr[i]+" ");
                System.out.println();
            }else System.out.println("No");
        }
    }
}