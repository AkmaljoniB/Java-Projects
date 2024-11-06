package Codeforces;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Chemistry_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String s = scanner.next();
            Map<String, Integer> map = new LinkedHashMap<>();
            int l = (s.length()-k)%2;
            String b = "YES";
            for (int i = 0; i < n; i++) map.put(s.substring(i, i + 1), map.getOrDefault(s.substring(i, i + 1), 0) + 1);
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    if (l == 0) {
                        k--;
                        if (k < 0) {
                            b ="NO";
                            break;
                        }
                    } else l--;
                }
            }
            System.out.println(b);
        }
    }
}
