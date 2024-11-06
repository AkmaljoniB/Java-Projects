package Alexeev;

import java.util.*;

public class Alexeev_0047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Map<Integer,Integer>map = new TreeMap<>();
        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                String s = String.valueOf(i);
                int k = 0;
                for (int j = 0; j < s.length(); j++) k += Integer.parseInt(s.substring(j, j + 1));
                map.put(k,i);
            }
        }
        System.out.println(map.values().toArray()[map.size()-1]);
    }
}