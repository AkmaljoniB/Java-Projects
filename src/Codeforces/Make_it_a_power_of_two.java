package Codeforces;

import java.util.Scanner;

public class Make_it_a_power_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int min=Integer.MAX_VALUE;
            for (int i = 0; i < 60; i++) {
                String p = (long)Math.pow(2, i) + "";
                int l = 0;
                for (int k=0;k<s.length();k++) {
                    if (p.charAt(l)==s.charAt(k)) {
                        l++;
                        if (l==p.length())break;
                    }
                }
                min=Math.min(s.length()-l+p.length()-l,min);
            }
            System.out.println(min);
        }
    }
}
