package Alexeev;

import java.util.Scanner;

public class Alexeev_0996 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=1;
        int[]arr=new int[1000000];
        arr[1]=1;
        for(int i=2;i<=n;i++){
            if (arr[i]==1)l+=3;
            else l+=2;
            arr[l]=1;
        }
        System.out.println(l);
    }
}