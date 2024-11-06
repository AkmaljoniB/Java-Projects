package Codeforces;

import java.util.Scanner;

public class Tiles_are_coming_back {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),l=0,j=0;
            int[]arr=new int[n];
            String s="NO";
            for (int i=0;i<n;i++)arr[i]=sc.nextInt();
            for (int i=0;i<n;i++) {
                if (arr[i]==arr[0]){
                    l++;
                    j=i;
                    if (l==k)break;
                }
            }
            if (l==k) {
                if (arr[0] == arr[n - 1]) s = "YES";
                l = 0;
                for (int i = n - 1; i > j; i--) if (arr[i] == arr[n - 1]) l++;
                if (l >= k) s = "YES";
            }
            System.out.println(s);
        }
    }
}