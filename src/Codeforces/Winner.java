package Codeforces;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Winner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] nameArr = new String[n];
        int[] scoreArr = new int[n];
        for (int i = 0; i < n; ++i) {
            nameArr[i] = scanner.next();
            int score = scanner.nextInt();
            map.put(nameArr[i],map.getOrDefault(nameArr[i],0)+score);
            scoreArr[i] = map.get(nameArr[i]);
        }
        int maxScore = Collections.max(map.values());
        for (int i = 0; i < n; ++i) {
            if (map.get(nameArr[i]) == maxScore && scoreArr[i] >= maxScore) {
                System.out.println(nameArr[i]);
                break;
            }
        }
    }
}
