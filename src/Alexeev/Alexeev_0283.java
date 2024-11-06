package Alexeev;

import java.util.Scanner;

public class Alexeev_0283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = 1;
        String b = "Yes";
        if (s.substring(0, 1).toLowerCase().equals(s.substring(0, 1)) || s.length() == 1) b = "No";
        for (int i = 1; i < s.length(); i++) {
            if (!s.substring(i, i + 1).toLowerCase().equals(s.substring(i, i + 1))) {
                if (l == 1) {
                    b = "No";
                    break;
                }
                l = 0;
                l++;
            } else {
                l++;
                if (l > 4) {
                    b = "No";
                    break;
                }
            }
        }
        if (l == 1) b = "No";
        System.out.println(b);
    }
}
