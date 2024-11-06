package Codeforces;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem_Solving_Journal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            Map<String, Integer> map = new TreeMap<>();
            for (int i = 0; i < n; i++) map.put(s.substring(i, i + 1), map.getOrDefault(s.substring(i, i + 1), 0) + 1);
            int k=0;
            for(Map.Entry<String,Integer>entry:map.entrySet()){
                if (entry.getValue()>=entry.getKey().hashCode()-64)k++;
            }
            System.out.println(k);
        }
    }
}
