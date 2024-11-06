package Codeforces;

import java.util.Scanner;

public class Black_and_white_stripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int max = s.substring(0,k).replace("W","").length();
            int l =max;
            for (int i = k; i < n; i++) {
                if (s.charAt(i) == 'B')l++;
                if (s.charAt(i - k) == 'B')l--;
                max = Math.max(max,l);
            }
            System.out.println(k-max);
        }
    }
}
