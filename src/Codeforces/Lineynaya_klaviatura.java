package Codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lineynaya_klaviatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {
            String alphabit = scanner.next();
            int k = 0,l=0;
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < alphabit.length(); i++) {
                map.put(alphabit.substring(i,i+1),i);
            }
            String s = scanner.next();
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.substring(i,i+1))) {
                    k+=Math.abs(l-map.get(s.substring(i,i+1)));
                    l=map.get(s.substring(i,i+1));
                }
            }
            k-=map.get(s.substring(0,1));
            System.out.println(k);
            n--;
        }
    }
}