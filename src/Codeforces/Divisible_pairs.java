package Codeforces;

import java.util.Scanner;

public class Divisible_pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt(),max=0,m=Math.max(x,y),k=0;
            int[]arr=new int[n];
            for (int i=0;i<n; i++) {
                arr[i]=sc.nextInt();
                max=Math.max(max,arr[i]);
            }
            int[]a=new int[max+1];
            for (int i=0;i<n;i++)a[arr[i]]++;
            for (int i=1;i<=max;i++){
                if (a[i]!=0) {
                    int j=i<m?m-i:m+m-i%m;
                    if (i>j)j+=m;
                    if (m!=x)j=i+m;
                    while (j<=max) {
                        if (a[j]!=0&&(j+i)%x==0&&(j-i)%y==0&&i!=j)k+=a[j]*a[i];
                        j += m;
                    }
                    if (a[i] != 1 && (i + i) % x == 0) k += a[i] * (a[i] - 1) / 2;
                }
            }
            System.out.println(k);
        }
    }
}
