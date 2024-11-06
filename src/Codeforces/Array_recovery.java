package Codeforces;

import java.util.*;

public class Array_recovery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),p=0;
            StringBuilder sb=new StringBuilder();
            String f="-1";
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if (!f.contentEquals(sb))sb.append((a+p)+" ");
                if (p-a>=0&&a!=0)sb=new StringBuilder("-1");
                p+=a;
            }
            System.out.println(sb);
        }
    }
}
