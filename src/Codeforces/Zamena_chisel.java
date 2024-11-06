package Codeforces;

import java.io.*;
import java.util.*;

public class Zamena_chisel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String n = br.readLine();
            String[] ars = br.readLine().split(" ");
            String s = br.readLine();
            Map<String, String> map = new HashMap<>();
            String b = "YES";
            for (int i = 0; i < ars.length; i++) {
                if (map.containsKey(ars[i]) && !map.get(ars[i]).equals(s.substring(i, i + 1))) {
                    b = "NO";
                    break;
                } else {
                    map.put(ars[i], s.substring(i, i + 1));
                }
            }
            System.out.println(b);
        }
    }
}