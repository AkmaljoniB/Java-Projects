package Alexeev;

import java.util.Scanner;

public class Alexeev_0446 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] str = new String[n];
        String s = "YES";
        for (int i = 0; i < n; i++) str[i] = scanner.next();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = scanner.nextInt();
                if (s.equals("YES")) {
                    String p = str[i].substring(j, j + 1);
                    if (p.equals("R")) {
                        if (a < 4) s = "NO";
                    } else if (p.equals("G")) {
                        if (a != 2 && a != 3 && a != 6 && a != 7) s = "NO";
                    } else if (p.equals("B")){
                        if (a != 1 && a != 3 && a != 5 && a != 7) s = "NO";
                    }
                }
            }
        }
        System.out.println(s);
    }
}