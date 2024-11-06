package Codeforces;

import java.io.*;
import java.util.*;

public class Chudesnaya_raskraska_1 {
    public static void Wonderful_coloring_1(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            Map<String,Integer> map = new HashMap<>();
            String s = br.readLine();
            int k=0;
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.substring(i, i + 1)) && map.get(s.substring(i, i + 1)).equals(1)) {
                    k++;
                    map.put(s.substring(i, i + 1), 2);
                } else if (!map.containsKey(s.substring(i,i+1))){
                    map.put(s.substring(i, i + 1), 1);
                }
            }
            System.out.println((map.size()+k)/2);
        }
    }
}