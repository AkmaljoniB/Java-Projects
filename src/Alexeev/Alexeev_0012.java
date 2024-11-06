package Alexeev;

import java.util.Scanner;

public class Alexeev_0012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int k = 0;
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int x3 = scanner.nextInt();
            int y3 = scanner.nextInt();
            int x4 = scanner.nextInt();
            int y4 = scanner.nextInt();
            double a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            double b = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
            double c = Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2));
            double d = Math.sqrt(Math.pow(x4 - x1, 2) + Math.pow(y4 - y1, 2));
            double a1 = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
            double b1 = Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2));
            double c1 = Math.sqrt(Math.pow(x - x3, 2) + Math.pow(y - y3, 2));
            double d1 = Math.sqrt(Math.pow(x - x4, 2) + Math.pow(y - y4, 2));
            double pa = (a + a1 + b1) / 2;
            double pb = (b + b1 + c1) / 2;
            double pc = (c + c1 + d1) / 2;
            double pd = (d + d1 + a1) / 2;
            double sa = Math.sqrt(pa * (pa - a) * (pa - a1) * (pa - b1));
            double sb = Math.sqrt(pb * (pb - b) * (pb - b1) * (pb - c1));
            double sc = Math.sqrt(pc * (pc - c) * (pc - c1) * (pc - d1));
            double sd = Math.sqrt(pd * (pd - d) * (pd - d1) * (pd - a1));
            if (Math.round(sa+sb+sc+sd) == Math.round(a * b)) k++;
        }
        System.out.println(k);
    }
}