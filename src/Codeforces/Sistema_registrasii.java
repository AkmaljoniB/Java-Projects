package Codeforces;


import java.util.*;

public class Sistema_registrasii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            map.put(s, map.getOrDefault(s, -1) + 1);
            System.out.println(map.get(s) == 0 ? "OK" : s + map.get(s));
        }
    }
}