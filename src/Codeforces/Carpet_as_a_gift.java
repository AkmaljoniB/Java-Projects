package Codeforces;

import java.util.Scanner;

public class Carpet_as_a_gift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String[] arr = new String[n];
            String b = "No";
            int x = 0, y = 0, z = 0, o = 0;
            for (int i = 0; i < n; i++) arr[i] = sc.next();
            for (int j = 0; j < m; j++) {
                String s = "";
                for (int i = 0; i < n; i++) s = s + arr[i].substring(j, j + 1);
                if (x == 0 && s.contains("v")) x++;
                else if (x == 1 && y == 0 && s.contains("i")) y++;
                else if (y == 1 && z == 0 && s.contains("k")) z++;
                else if (z == 1 && s.contains("a")) o++;
                if (x != 0 && y != 0 && z != 0 && o != 0) {
                    b = "YES";
                    break;
                }
            }
            System.out.println(b);
        }
    }
}