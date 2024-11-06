package Codeforces;

import java.io.*;
import java.util.*;

public class Karmani_Polikarpa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] ars = br.readLine().split(" ");
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(ars[i])) {
                map.put(ars[i], map.get(ars[i]) + 1);
            } else {
                map.put(ars[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            max = Math.max(entry.getValue(), max);
        }
        System.out.println(max);
    }
}