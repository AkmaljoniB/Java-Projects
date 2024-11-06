package Codeforces;

import java.util.Scanner;

public class Pair_programming {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int k =sc.nextInt(),n=sc.nextInt(),m=sc.nextInt(),l1=0,l2=0;
            int[]a=new int[n],b=new int[m];
            for (int i=0;i<n;i++) a[i]=sc.nextInt();
            for (int i=0;i<m;i++) b[i]=sc.nextInt();
            StringBuilder sb=new StringBuilder();
            for (int i=0;i<n+m;i++) {
                if (l1!=n &&(l2==m||a[l1]<b[l2])){
                    sb.append(a[l1]+" ");
                    if (a[l1]==0)k++;
                    if (a[l1]>k){
                        sb=new StringBuilder("-1");
                        break;
                    }
                    l1++;
                }else {
                    sb.append(b[l2]+" ");
                    if (b[l2]==0)k++;
                    if (b[l2]>k){
                        sb=new StringBuilder("-1");
                        break;
                    }
                    l2++;
                }
            }
            System.out.println(sb);
        }
    }
}
