package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class Bessie_and_MEX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter pr=new PrintWriter(System.out);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0;
            Set<Integer>set=new HashSet<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt(),p=Math.abs(a-l);
                if(a>=0){
                    p=l;
                    l++;
                    while (set.contains(l))l++;
                }else set.add(p);
                pr.print(p+" ");
            }
            pr.println();
        }
        pr.close();
    }
}