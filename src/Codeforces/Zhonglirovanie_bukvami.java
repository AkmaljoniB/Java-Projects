package Codeforces;

import java.io.*;
import java.util.*;

public class Zhonglirovanie_bukvami {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String s = br.readLine();
                for (int j = 0; j < s.length(); j++) {
                    if (map.containsKey(s.substring(j, j + 1))) {
                        map.put(s.substring(j, j + 1), map.get(s.substring(j, j + 1)) + 1);
                    } else {
                        map.put(s.substring(j, j + 1), 1);
                    }
                }
            }
            int k = 0;
            for (Map.Entry<String,Integer>entry :map.entrySet()) {
                if (entry.getValue()%n==0&&entry.getValue()>=n){
                    k++;
                } else {
                    break;
                }
            }
            System.out.println(k == map.size() ? "YES" : "NO");
        }
    }
}