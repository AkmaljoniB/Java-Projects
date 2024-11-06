package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class Double_lines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pr = new PrintWriter(System.out);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String[] arr = new String[n];
            Map<Integer, Map<String, Set<String>>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String s = scanner.next();
                arr[i] = s;
                if (!map.containsKey(s.length())) map.put(s.length(), new TreeMap<>());
                if (!map.get(s.length()).containsKey(s.substring(0, 1))) {
                    map.get(s.length()).put(s.substring(0, 1), new HashSet<>());
                }
                map.get(s.length()).get(s.substring(0, 1)).add(s);
            }
            for (int i = 0; i < arr.length; i++) {
                int l = arr[i].length();
                n = 0;
                for (int j = 1; j <= l / 2; j++) {
                    if (map.containsKey(j) && map.containsKey(l - j)) {
                        String s1 = arr[i].substring(j, j + 1);
                        if (map.get(j).containsKey(arr[i].substring(0, 1)) && map.get(l - j).containsKey(s1) && map.get(j).get(arr[i].substring(0, 1)).contains(arr[i].substring(0, j)) && map.get(l - j).get(s1).contains(arr[i].substring(j))) {
                            n = 1;
                            break;
                        }
                        s1 = arr[i].substring(l - j, l - j + 1);
                        if (map.get(l - j).containsKey(arr[i].substring(0, 1)) && map.get(j).containsKey(s1) && map.get(l - j).get(arr[i].substring(0, 1)).contains(arr[i].substring(0, l - j)) && map.get(j).get(s1).contains(arr[i].substring(l - j))) {
                            n = 1;
                            break;
                        }
                    }
                }
                pr.print(n);
            }
            pr.println();
        }
        pr.close();
    }
}