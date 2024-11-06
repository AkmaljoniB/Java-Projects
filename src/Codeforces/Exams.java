package Codeforces;

import java.util.*;

public class Exams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        int s = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (!map.containsKey(a)) map.put(a, new ArrayList<>());
            map.get(a).add(b);
        }
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            Collections.sort(entry.getValue());
            for (Integer integer : entry.getValue()) {
                if (s <= integer) s = integer;
                else {
                    s = entry.getKey();
                    break;
                }
            }
        }
        System.out.println(s);
    }
}