package Codeforces;

import java.io.*;
import java.util.*;

public class Igra_s_udaleniem_podstrok {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            List<Integer> list = new ArrayList<>();
            int k = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.substring(i, i + 1).equals("1")) {
                    for (int j = i; j < s.length(); j++) {
                        if (s.substring(j, j + 1).equals("0")) {
                            list.add(k);
                            k = 0;
                            i = j;
                            break;
                        } else {
                            k++;
                        }
                        if (j == s.length() - 1) {
                            i = j;
                        }
                    }
                }
                if (k == s.length()) {
                    break;
                }
            }
            list.add(k);
            int sum = 0;
            Collections.sort(list);
            for (int i = list.size() - 1; i >= 0; i -= 2) {
                sum += list.get(i);
            }
            System.out.println(sum);
        }
    }
}