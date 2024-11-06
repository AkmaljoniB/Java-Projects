package Codeforces;

import java.util.Scanner;

public class Seating_the_cats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s1 = sc.next(), s2 = sc.next();
            int l1=0,l2=0;
            for (int i=0;i<n;i++) {
                if (s1.charAt(i)!=s2.charAt(i)){
                    if (s1.charAt(i)=='1')l1++;
                    else l2++;
                }
            }
            System.out.println(Math.max(l1,l2));
        }
    }
}
