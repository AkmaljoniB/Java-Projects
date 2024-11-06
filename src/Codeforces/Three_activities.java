package Codeforces;

import java.util.*;

public class Three_activities {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n = sc.nextInt(),max=0;
            int[][]a=new int[n][2];
            int[][]b=new int[n][2];
            int[][]c=new int[n][2];
            for (int i=0;i<n;i++){
                a[i][0]=sc.nextInt();
                a[i][1]=i;
            }
            for (int i=0;i<n;i++){
                b[i][0]=sc.nextInt();
                b[i][1]=i;
            }
            for (int i=0;i<n;i++){
                c[i][0]=sc.nextInt();
                c[i][1]=i;
            }
            Arrays.sort(a,Comparator.comparingInt(d->d[0]));
            Arrays.sort(b,Comparator.comparingInt(d->d[0]));
            Arrays.sort(c,Comparator.comparingInt(d->d[0]));
            for (int i =n-1;i>=n-3;i--) {
                for (int j=n-1;j>=n-3;j--) {
                    for (int q=n-1;q>=n-3;q--) {
                        if (a[i][1]!=b[j][1]&&b[j][1]!=c[q][1]&&a[i][1]!=c[q][1])max=Math.max(max,a[i][0]+b[j][0]+c[q][0]);
                    }
                }
            }
            System.out.println(max);
        }
    }
}