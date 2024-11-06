package Codeforces;

import java.util.Scanner;

public class Choose_different {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
            int[]ar1=new int[k];
            int[]ar2=new int[k];
            for (int i=0;i<n;i++) {
                int a=sc.nextInt();
                if (a<=k)ar1[a-1]++;
            }
            for (int i=0;i<m;i++) {
                int a=sc.nextInt();
                if (a<=k)ar2[a-1]++;
            }
            int l1=0,l2=0;
            String s="YES";
            for (int i=0;i<k;i++){
                if (ar1[i]!=0)l1++;
                if (ar2[i]!=0)l2++;
                if (ar1[i]==0 &&ar2[i]==0)s="NO";
            }
            if (l1<k/2||l2<k/2)s="NO";
            System.out.println(s);
        }
    }
}
