package Codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Night_in_museum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 0);
        map.put("b", 1);
        map.put("c", 2);
        map.put("d", 3);
        map.put("e", 4);
        map.put("f", 5);
        map.put("g", 6);
        map.put("h", 7);
        map.put("i", 8);
        map.put("j", 9);
        map.put("k", 10);
        map.put("l", 11);
        map.put("m", 12);
        map.put("n", 13);
        map.put("o", 14);
        map.put("p", 15);
        map.put("q", 16);
        map.put("r", 17);
        map.put("s", 18);
        map.put("t", 19);
        map.put("u", 20);
        map.put("v", 21);
        map.put("w", 22);
        map.put("x", 23);
        map.put("y", 24);
        map.put("z", 25);
        int k = 0, l = 26;
        for (int i = 0; i < s.length(); i++) {
            String sb = s.substring(i, i + 1);
            if (map.containsKey(sb)) {
                k += Math.min(26 - l + map.get(sb), Math.min(Math.abs(l-map.get(sb)),l+26-map.get(sb)));
                l = map.get(sb);
            }
        }
        System.out.println(k);
    }
}