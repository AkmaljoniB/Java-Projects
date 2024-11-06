package Codeforces;

import java.util.Scanner;

public class Two_friends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt(),l=3;
            int[]arr=new int[n+1];
            for(int i=1;i<=n;i++)arr[i]=sc.nextInt();
            for(int i=1;i<=n;i++){
                if(arr[arr[i]]==i){
                    l=2;
                    break;
                }
            }
            System.out.println(l);
        }
    }
}