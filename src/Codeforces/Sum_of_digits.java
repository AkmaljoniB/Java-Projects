package Codeforces;

import java.util.*;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = 0, sum;
        while (s.length() > 1) {
            sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
            }
            k++;
            s = sum + "";
        }
        System.out.println(k);
    }
}
