package Codeforces;

import java.util.Scanner;

public class Moving_chips_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),l=0,k=0;
            int[]arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if (arr[i]==1)l=1;
                if (l==1&&arr[i]==0)k++;
            }
            for (int i=n-1;i>=0;i--){
                if (arr[i]==0)k--;
                else break;
            }
            System.out.println(k);
        }
    }
}
