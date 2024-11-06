package Codeforces;

import java.util.Scanner;

public class Poisoned_Dagger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();long h=sc.nextLong();
            int[]arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            long l=h/n;
            while (true){
                long s=l;
                for (int i=1;i<n;i++) {
                    if (arr[i-1]+l-1>=arr[i])s+=arr[i]-arr[i-1];
                    else s+=l;
                }
                if (s>=h)break;
                else l+=Math.max((h-s)/n,1);
            }
            System.out.println(l);
        }
    }
}
