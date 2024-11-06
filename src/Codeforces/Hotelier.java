package Codeforces;

import java.util.Scanner;

public class Hotelier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int[]arr=new int[10];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='L'){
                for(int j=0;j<10;j++){
                    if(arr[j]==0){
                        arr[j]=1;
                        break;
                    }
                }
            }else if(s.charAt(i)=='R'){
                for(int j=9;j>=0;j--){
                    if(arr[j]==0){
                        arr[j]=1;
                        break;
                    }
                }
            }else arr[s.charAt(i)-'0']=0;
        }
        for(int i=0;i<10;i++)System.out.print(arr[i]);
    }
}