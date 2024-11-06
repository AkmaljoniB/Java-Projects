package Alexeev;

import java.util.Scanner;

public class Alexeev_0019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "ABCDEFGH";
        String f = scanner.next();
        int q = Integer.parseInt(f.substring(1, 2)) - 1;
        int w = a.indexOf(f.substring(0, 1));
        f = scanner.next();
        int e = Integer.parseInt(f.substring(1, 2)) - 1;
        int r = a.indexOf(f.substring(0, 1));
        f = scanner.next();
        int t = Integer.parseInt(f.substring(1, 2)) - 1;
        int y = a.indexOf(f.substring(0, 1));
        int k = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i == q && j == w) || (i == e && j == r) || (i == t && j == y)) {
                } else {
                    if (i == q || i == e) k ++;
                    else if (j == w || j == r) k++;
                    else if (Math.abs(i - q) == Math.abs(j - w)) k++;
                    else if ((Math.abs(i - t) == 2 && Math.abs(j - y) == 1) || (Math.abs(i - t) == 1 && Math.abs(j - y) == 2))
                        k++;
                }
            }
        }
        System.out.println(k);
    }
}