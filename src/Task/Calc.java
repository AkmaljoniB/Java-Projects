package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int c = 0, d = 0, e = 0, f = 0;
        char s6 = '/';
        char s5 = '*';
        char s4 = '+';
        char s3 = '-';
        String s2 = "";
        String s1 = "";
        int k = s.length();
        int l = 0;
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == s3) {
                c++ ;
                break;
            } else if (s.charAt(i) == s4) {
                d++;
                break;
            } else if (s.charAt(i) == s5) {
                e++ ;
                break;
            } else if (s.charAt(i) == s6) {
                f++;
                break;
            } else {
                s1 += s.charAt(i);
                l++;
            }
        }
        for (int i = 0; i < k; i++) {
            if (i > l) {
                s2 += s.charAt(i);
            }
        }
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);
        if (c == 1) {
            System.out.println(a - b);
        } else if (d == 1) {
            System.out.println(a + b);
        } else if (e == 1) {
            System.out.println(a * b);
        } else if (f == 1) {
            System.out.println(a / b);
        }
    }
}