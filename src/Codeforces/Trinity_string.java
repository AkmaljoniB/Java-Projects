package Codeforces;

import java.util.Scanner;

public class Trinity_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int l = Integer.MAX_VALUE;
            int x = -1, y = -1, z = -1;
            for (int i = 0; i < s.length(); i++) {
                if (s.startsWith("1", i)) x = i;
                else if (s.startsWith("2", i)) y = i;
                else z = i;
                if (x >= 0 && y >= 0 && z >= 0) {
                    int min = Math.min(x, Math.min(y, z));
                    int max = Math.max(x, Math.max(y, z));
                    if (max - min + 1 < l) l = max - min + 1;
                }
            }
            System.out.println(l != Integer.MAX_VALUE ? l : 0);
        }
    }
}