package Codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Thief_and_matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = 0;
        List<String>list = new ArrayList<>();
        int[] ar = new int[m];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            ar[i] = b;
            list.add(b + " " + a);
        }
        Arrays.sort(ar);
        out:
        for (int i = m - 1; i >= 0; i--) {
            String p = ar[i] + "";
            for (int j = 0; j < m; j++) {
                if (list.get(j).startsWith(p)) {
                    int q = Integer.parseInt(list.get(j).substring(p.length() + 1));
                    if (n > q) {
                        n -= q;
                        s += ar[i] * q;
                        list.remove(list.get(j));
                        m--;
                        break ;
                    } else {
                        s += n * ar[i];
                        break out;
                    }
                }
            }
        }
        System.out.println(s);
    }
}
