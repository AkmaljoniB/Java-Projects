package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=2,p=1,f;
        List<Integer>list=new ArrayList<>();
        list.add(1);
        while (l<=n) {
            list.add(l);
            f=l;
            l+=p;
            p=f;
        }
        for (int i=1;i<=n;i++) {
            String s="o";
            if (list.contains(i)) s="O";
            System.out.print(s);
        }
    }
}