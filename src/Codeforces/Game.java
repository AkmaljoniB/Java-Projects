package Codeforces;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=0;
            int[]arr=new int[n];
            for (int i=0;i<n;i++) arr[i]=sc.nextInt();
out:            for (int i=0;i<n;i++){
                if (arr[i]==0){
                    for (int j=n-1;j>=0;j--) {
                        if (arr[j]==0){
                            k=j-i+2;
                            break out;
                        }
                    }
                }
            }
            System.out.println(k);
        }
    }
}