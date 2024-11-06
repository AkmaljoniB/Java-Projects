package Codeforces;

import java.util.*;

public class Photographer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), d = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt(),k=0;
        long s = 0;
        StringBuilder o = new StringBuilder();
        Map<Integer, LinkedList<Integer>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int c = scanner.nextInt() * a + scanner.nextInt() * b;
            if (!map.containsKey(c)) map.put(c,new LinkedList<>());
            map.get(c).add(i);
        }
        out :for (Map.Entry<Integer, LinkedList<Integer>> entry : map.entrySet()) {
            for (Integer integer : entry.getValue()) {
                if (s+entry.getKey()<=d){
                    s+=entry.getKey();
                    k++;
                    o.append(integer+1).append(" ");
                } else break out;
            }
        }
        System.out.println(k);
        System.out.println(o);
    }
}
