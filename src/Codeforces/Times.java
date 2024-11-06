package Codeforces;

import java.util.Scanner;

public class Times {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int x = scanner.nextInt();
            int h1 = x / 60;
            int m1 = x % 60;
            int h = Integer.parseInt(s.substring(0, s.indexOf(":")));
            int m = Integer.parseInt(s.substring(s.indexOf(":") + 1));
            int H = h;
            int M = m;
            int k = 0;
            do {
                m += m1;
                h += h1;
                h += m / 60;
                h = h % 24;
                m = m % 60;
                String p = String.valueOf(h);
                if (p.length()==1)p=0+p;
                String f = String.valueOf(m);
                if (f.length()==1)f=0+f;
                StringBuilder sb = new StringBuilder(p);
                sb.reverse();
                if (f.contentEquals(sb)) k++;
            } while (h != H || m != M);
            System.out.println(k);
        }
    }
}
