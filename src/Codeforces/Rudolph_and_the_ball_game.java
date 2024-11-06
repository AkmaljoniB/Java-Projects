package Codeforces;

import java.util.*;

public class Rudolph_and_the_ball_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt(),m=sc.nextInt(),x=sc.nextInt();
            Set<Integer>set=new TreeSet<>();
            set.add(x);
            for (int i = 0; i < m; i++) {
                int r=sc.nextInt();
                String s=sc.next();
                Set<Integer>p=new TreeSet<>();
                for (Integer a:set) {
                    if (s.equals("?") || s.equals("0")) {
                        if ((a+r)%n==0)p.add(n);
                        else p.add((a+r)% n);
                    }
                    if (s.equals("?") || s.equals("1")) {
                        if (a-r==0)p.add(n);
                        else if (a-r>0)p.add(a-r);
                        else p.add(n+a- r);
                    }
                }
                set=p;
            }
            System.out.println(set.size());;
            for (Integer a:set) System.out.print(a+" ");
            System.out.println();
        }
    }
}