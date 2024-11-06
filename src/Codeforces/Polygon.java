package Codeforces;

import java.util.Scanner;

public class Polygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String [][] arr = new String[n][n];
            for (int i = 0; i < n; i++) {
                String q =scanner.next();
                for (int j = 0; j < n; j++) {
                    arr[i][j]=q.substring(j,j+1);
                }
            }
            String s = "YES";
            out:
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if ((arr[i][j].equals("1") && !arr[i][j + 1].equals("1") && !arr[i + 1][j].equals("1"))) {
                        s = "NO";
                        break out;
                    }
                }
            }
            System.out.println(s);
        }
    }
}
