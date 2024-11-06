package Codeforces;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Amr_and_music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        Map<Integer, LinkedList<Integer>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (!map.containsKey(a)) map.put(a, new LinkedList<>());
            map.get(a).add(i);
        }
        int k = 0;
        String st = "";
        for (Map.Entry<Integer, LinkedList<Integer>> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                s -= entry.getKey();
                if (s < 0) break;
                st = st + (entry.getValue().get(i) + 1) + " ";
                k++;
            }
        }
        System.out.println(k);
        if (k != 0) System.out.println(st);
    }
}
