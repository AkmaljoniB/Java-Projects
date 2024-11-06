package Codeforces;

import java.util.Scanner;

public class Traffic_light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String c = sc.next(), s = sc.next();
            s = s.concat(s);
            int k = 0, max = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != 'g') {
                    if (k>0 || (k == 0 && s.substring(i, i + 1).equals(c))) k++;
                } else {
                    max = Math.max(max, k);
                    k = 0;
                }
            }
            System.out.println(max);
        }
    }
}
