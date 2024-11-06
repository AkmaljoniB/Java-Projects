package Codeforces;

import java.util.Scanner;

public class Gerrymandering {
    static int l,r,n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int k=0;
            n=sc.nextInt();
            char[][]arr=new char[2][];
            arr[0]=sc.next().toCharArray();
            arr[1]=sc.next().toCharArray();
            while(l<n&&r<n){
                int w=func(arr,204);
                if(w==0){
                    w=func(arr,195);
                    if(w==0){
                        if(l==r){
                            if(arr[1][r+1]=='J')r++;
                            else l++;
                            l++;
                            r++;
                        }else l=r=Math.max(l,r)+1;
                    }
                    else k+=w;
                }else k+=w;
            }
            System.out.println(k);
            l=r=0;
        }
    }
    static int func(char[][]arr,int q){
        if(l<=r&&arr[0][l]+arr[0][l+1]+arr[1][r]==q){
            l+=2;
            r++;
            return 1;
        }else if(r<=l&&arr[0][l]+arr[1][r]+arr[1][r+1]==q){
            l++;
            r+=2;
            return 1;
        }else if(l+3<=n&&arr[0][l]+arr[0][l+1]+arr[0][l+2]==q){
            if(r+3<=n&&arr[1][r]+arr[1][r+1]+arr[1][r+2]==q)return 2;
            r+=3;
            l+=3;
            return 1;
        }else if(r+3<=n&&arr[1][r]+arr[1][r+1]+arr[1][r+2]==q){
            r+=3;
            l+=3;
            return 1;
        }
        return 0;
    }
}