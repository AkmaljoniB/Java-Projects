package Codeforces;

import java.util.Scanner;

public class Keeping_the_array_beautiful {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),l=0,p=-1,max=0;
            int[]arr=new int[n];
            arr[0]=sc.nextInt();
            System.out.print(1);
            max=arr[0];
            for(int i=1;i<n;i++){
                arr[i]=sc.nextInt();
                if (arr[i]>=max&&l==0){
                    System.out.print(1);
                    max=Math.max(max,arr[i]);
                } else {
                    if (arr[i]<=arr[0]&&l==0) {
                        System.out.print(1);
                        p=i;
                        l++;
                    }else if(arr[i]<=arr[0]&&arr[i]>=arr[p]){
                        System.out.print(1);
                        p=i;
                    } else System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}