package Alexeev;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Alexeev_0119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, LinkedList<String>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            int c = scanner.nextInt();
            String s = h + " " + m + " " + c;
            if (!map.containsKey(h * 3600 + m * 60 + c)) map.put(h * 3600 + m * 60 + c, new LinkedList<>());
            map.get(h * 3600 + m * 60 + c).add(s);
        }
        for (Map.Entry<Integer, LinkedList<String>> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println(entry.getValue().get(i));
            }
        }
    }
}
