package Codeforces;

import java.util.Scanner;
import java.util.TreeSet;

public class Restoring_the_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            TreeSet<Integer>min=new TreeSet<>();
            TreeSet<Integer>max=new TreeSet<>();
            StringBuilder sb=new StringBuilder();
            StringBuilder bb=new StringBuilder();
            for (int i=1;i<=n;i++){
                max.add(i);
                min.add(i);
            }
            int prev=0;
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                min.remove(p);
                max.remove(p);
                if (prev!=p) {
                    sb.append(p + " ");
                    bb.append(p + " ");
                } else {
                    sb.append(min.pollFirst() + " ");
                    int m = max.floor(p);
                    bb.append(m + " ");
                    max.remove(m);
                }
                prev=p;
            }
            System.out.println(sb);
            System.out.println(bb);
        }
    }
}