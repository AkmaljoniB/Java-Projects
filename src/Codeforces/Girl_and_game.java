package Codeforces;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Girl_and_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Map<String, Integer> map = new LinkedHashMap<>();
        int k = 1,l=0;
        for (int i = 0; i < s.length(); i++)
            map.put(s.substring(i, i + 1), map.getOrDefault(s.substring(i, i + 1), 0) + 1);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                k ^= 1;
                l++;
            }
        }
        if (k == 0||l==0) System.out.println("First");
        else System.out.println("Second");
    }
}
