package Codeforces;

import java.util.Scanner;

public class Good_Anton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n =sc.nextInt(),o=-1,p=-1;
            int[]a=new int[n],b=new int[n];
            String s="YES";
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if (a[i]==1&&o==-1)o=i;
                else if (a[i]==-1 &&p==-1)p=i;
            }
            for(int i=0;i<n;i++)b[i]=sc.nextInt();
            for (int i=n-1;i>=0;i--){
                if (a[i]!=b[i]){
                    if (a[i]>b[i]&&p<i&&p!=-1)a[i]=b[i];
                    else if (a[i]<b[i]&&o<i&&o!=-1)a[i]=b[i];
                }
                if (a[i]!=b[i])s="NO";
            }
            System.out.println(s);
        }
    }
}