package Codeforces;

import java.util.Scanner;

public class Social_distance_1367C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt(), l = 0;
            String s = sc.next();
            if (n <= k) {
                if (!s.contains("1")) l = 1;
            } else {
                if (!s.substring(0, k + 1).contains("1")){
                    l++;
                    s="1"+s.substring(1);
                }
                if (!s.substring(n - k - 1).contains("1")) {
                    l++;
                    s = s.substring(0, s.length() - 1) + "1";
                }
                for (int i = k + 1; i < n - k; i++) {
                    if (!s.substring(i - k, i + k + 1).contains("1")) {
                        l++;
                        i += k;
                    }
                }
            }
            System.out.println(l);
        }
    }
}