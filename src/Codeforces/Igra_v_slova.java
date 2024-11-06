package Codeforces;

import java.io.*;
import java.util.*;

public class Igra_v_slova {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s1 = br.readLine();
            String[] ars1 = s1.split(" ");
            String[] ars2 = br.readLine().split(" ");
            String[] ars3 = br.readLine().split(" ");
            int l1 = n * 3, l2, l3 = n * 3;
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(ars1[i], 3);
            }
            for (int i = 0; i < n; i++) {
                if (map.containsKey(ars2[i])) {
                    map.put(ars2[i], 1);
                    l1 -= 2;
                } else {
                    map.put(ars2[i], 3);
                }
            }
            l2 = l1;
            for (int i = 0; i < n; i++) {
                if (map.containsKey(ars3[i])) {
                    if (map.get(ars3[i]) == 1) {
                        l1--;
                        l2--;
                        l3 -= 3;
                    } else {
                        if (s1.contains(ars3[i]))  l1 -= 2;
                        else l2 -= 2;

                        l3 -= 2;
                    }
                }
            }
            System.out.println(l1 + " " + l2 + " " + l3);
        }
        br.close();
    }
}