package Codeforces;

import java.util.Scanner;

public class XY_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n =sc.nextInt();
            int b =sc.nextInt();
            int x =sc.nextInt();
            int y =sc.nextInt();
            int l =0;
            long s = 0;
            for (int i = 0; i < n; i++) {
                if (l+x<=b)l+=x;
                else l-=y;
                s+=l;
            }
            System.out.println(s);
        }
    }
}
