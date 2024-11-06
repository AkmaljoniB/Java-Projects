package Codeforces;

import java.io.*;
import java.util.*;

public class Scachivanie_operativnoy_pamyati {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            int n = Integer.parseInt(ars[0]), k = Integer.parseInt(ars[1]);
            Map<Integer, Integer> map = new TreeMap<>();
            String[] ars1 = br.readLine().split(" ");
            String[] ars2 = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                if (map.containsKey(Integer.parseInt(ars1[i]))) {
                    map.put(Integer.parseInt(ars1[i]), map.get(Integer.parseInt(ars1[i]))+Integer.parseInt(ars2[i]));
                } else {
                    map.put(Integer.parseInt(ars1[i]), Integer.parseInt(ars2[i]));
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (k >= entry.getKey()) {
                    k+=entry.getValue();
                } else {
                    break;
                }
            }
            System.out.println(k);
        }
    }
}