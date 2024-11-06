package Codeforces;

import java.io.*;
import java.util.*;

public class Not_a_cheap_line {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            int p = Integer.parseInt(br.readLine()), l = 0;
            Map<String, Integer> map = new TreeMap<>();
            List<String> list = new ArrayList<>();
            String f = "";
            for (int i = 0; i < s.length(); i++)
                map.put(s.substring(i, i + 1), map.getOrDefault(s.substring(i, i + 1), 0) + 1);
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                int a = (entry.getKey().hashCode() - 96) * entry.getValue();
                if (a <= p) {
                    list.add(entry.getKey());
                    p -= a;
                } else {
                    l = p / (entry.getKey().hashCode() - 96);
                    f = entry.getKey();
                    break;
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (list.contains(s.substring(i, i + 1))) pr.print(s.charAt(i));
                else if (s.substring(i, i + 1).equals(f) && l > 0) {
                    pr.print(s.charAt(i));
                    l--;
                }
            }
            pr.println();
        }
        pr.close();
    }
}
