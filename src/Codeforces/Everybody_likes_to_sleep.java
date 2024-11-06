package Codeforces;

import java.util.Scanner;

public class Everybody_likes_to_sleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int H = scanner.nextInt();
            int M = scanner.nextInt();
            int mh, mm, minh = Integer.MAX_VALUE, minm = Integer.MAX_VALUE;
            while (n-- > 0) {
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                if (H > h) mh = h + 23 - H;
                else mh = h - H;
                if (M > m) {
                    mm = m + 60 - M;
                    if (H < h) mh--;
                } else mm = m - M;
                if (mh<minh){
                    minh=mh;
                    minm=mm;
                }else if (mh==minh)minm=Math.min(mm,minm);
            }
            System.out.println(minh + " " + minm);
        }
    }
}
