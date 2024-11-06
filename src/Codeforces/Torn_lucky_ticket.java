package Codeforces;

import java.util.*;

public class Torn_lucky_ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<LinkedList<Integer>, Integer> juft = new HashMap<>();
        Map<LinkedList<Integer>, Integer> toq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            LinkedList<Integer> list = new LinkedList<>();
            for (int j = 0; j < s.length(); j++) list.add(Integer.parseInt(s.substring(j, j + 1)));
            if (s.length() % 2 == 0) juft.put(list, juft.getOrDefault(list, 0) + 1);
            else toq.put(list, toq.getOrDefault(list, 0) + 1);
        }
        System.out.println(test(juft) + test(toq));
    }

    static int test(Map<LinkedList<Integer>, Integer> map) {
        int k = 0;
        for (Map.Entry<LinkedList<Integer>, Integer> e : map.entrySet()) {
            for (Map.Entry<LinkedList<Integer>, Integer> p : map.entrySet()) {
                LinkedList<Integer> list = new LinkedList<>(e.getKey());
                list.addAll(p.getKey());
                int a = 0, b = 0;
                for (int l = 0; l < list.size() / 2; l++) {
                    a += list.get(l);
                    b += list.get(l + list.size() / 2);
                }
                if (a == b) k += e.getValue() * p.getValue();
            }
        }
        return k;
    }
}
