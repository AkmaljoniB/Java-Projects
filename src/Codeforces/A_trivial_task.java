package Codeforces;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A_trivial_task {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n =scanner.nextInt();
        Map<Integer,Integer> map = new LinkedHashMap<>();
        String s ="NO";
        for (int i = 0; i < n; i++) map.put(scanner.nextInt(),scanner.nextInt());
        for (Map.Entry<Integer,Integer>entry:map.entrySet()){
            if (map.containsKey(entry.getKey()+entry.getValue()) && entry.getKey()+entry.getValue() + map.get(entry.getKey()+entry.getValue())==entry.getKey()){
                s="YES";
                break;
            }
        }
        System.out.println(s);
    }
}
