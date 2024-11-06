package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class Gamer_Chemose {
    public static void main(String[] args) {
        PrintWriter pr=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),h=sc.nextInt(),p,o,max=0,max2=0;
            for (int i=0;i<n;i++) {
                int a=sc.nextInt();
                if (a>max){
                    max2= max;
                    max=a;
                } else max2=Math.max(max2,a);
            }
            p=max+max2;
            o=h/p*2;
            pr.println(max>=h?1:h%p==0?o:h%p<=max?o+1:o+2);
        }
        pr.close();
    }
}
