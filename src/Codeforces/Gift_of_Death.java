package Codeforces;

import java.util.Scanner;

public class Gift_of_Death {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),max=0,j=0;
            long s=0;
            int[]a=new int[n],b=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            for (int i=0;i<n;i++){
                b[i]=sc.nextInt();
                if (max<b[i]){
                    max=b[i];
                    j=i;
                }
            }
            for (int i=0;i<n;i++){
                if (i!=j)s+=b[i];
                s+=a[i];
            }
            System.out.println(s);
        }
    }
}