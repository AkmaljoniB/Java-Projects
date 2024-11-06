package Codeforces;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Drakons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sila_kirito = scanner.nextInt();
        int n = scanner.nextInt();
        int a=0;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (map.containsKey(x)){
                map.put(x, y+map.get(x));
            } else {
                map.put(x, y);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (sila_kirito > entry.getKey()) {
                sila_kirito+=entry.getValue();
            } else {
                System.out.println("NO");
                a++;
                break;
            }
        }
        if (a==0){
            System.out.println("YES");
        }
    }
}