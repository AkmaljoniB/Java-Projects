package Codeforces;

import java.util.*;

public class Number_of_k_values {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),l=sc.nextInt();
            int r=1,y=1;
            Set<Integer> set=new HashSet<>();
            while (r<=l&&l % r == 0) {
                while (r*y<=l&&l/r % y == 0) {
                    set.add(l/y/r);
                    y *= b;
                }
                y=1;
                r*=a;
            }
            System.out.println(set.size());
        }
    }
}
