package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Calc_Rimi {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> maplist = new HashMap<>();
        String s = bufferedReader.readLine();
        int c = 0, d = 0, f = 0;
        char s6 = '/';
        char s4 = '+';
        char s3 = '-';
        maplist.put("I", 1);
        maplist.put("II", 2);
        maplist.put("III", 3);
        maplist.put("IV", 4);
        maplist.put("V", 5);
        maplist.put("VI", 6);
        maplist.put("VII", 7);
        maplist.put("VIII", 8);
        maplist.put("IX", 9);
        maplist.put("X", 10);
        maplist.put("XI", 11);
        maplist.put("XII", 12);
        maplist.put("XIII", 13);
        maplist.put("XIV", 14);
        maplist.put("XV", 15);
        maplist.put("XVI", 16);
        maplist.put("XVII", 17);
        maplist.put("XVIII", 18);
        maplist.put("XIX", 19);
        maplist.put("XX", 20);
        String s2 = "";
        String s1 = "";
        int k = s.length();
        int l = 0;
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == s3) {
                c++;
                break;
            } else if (s.charAt(i) == s4) {
                d++;
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
    }
}