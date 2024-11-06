package Codeforces;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Segments_with_odd_sum {
    public static void main(String[] args) {
        PrintWriter pr=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while (q-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            List<Integer> list=new ArrayList<>();
            for (int i=0;i<n;i++) {
                int a=sc.nextInt();
                if (a%2!=0)list.add(i+1);
            }
            if (list.size()>=k){
                if (k%2==list.size()%2){
                    pr.println("YES");
                    for (int i=0;i<k-1; i++) pr.print(list.get(i)+" ");
                    pr.println(n);
                }else pr.println("NO");
            }else pr.println("NO");
        }
        pr.close();
    }
}
