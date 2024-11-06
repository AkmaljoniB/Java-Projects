package Alexeev;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Alexeev_0159 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) map.put(scanner.nextInt(), i + 1);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) System.out.print(entry.getValue() + " ");
    }
}
