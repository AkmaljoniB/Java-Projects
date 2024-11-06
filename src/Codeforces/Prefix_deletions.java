package Codeforces;

import java.util.Scanner;

public class Prefix_deletions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next(), p = "";
            for (int j = 0; j < s.length() - 1; j++) {
                if (s.charAt(j) != s.charAt(j + 1)) {
                    p = p.concat(s.substring(j, j + 1));
                    if (s.substring(j+1).contains(p.substring(0, 1))) p = "";
                    else {
                        s = s.substring(j);
                        break;
                    }
                }
            }
            System.out.println(p.equals("")?s.substring(s.length()-1):s);
        }
    }
}