package Codeforces;

import java.io.*;
import java.util.*;

public class Unique_bid_Auction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Map<Integer, Integer> map = new TreeMap<>();
            String[] ars = br.readLine().split(" ");
            int k = -1;
            for (int i = 0; i < n; i++) {
                if (map.containsKey(Integer.parseInt(ars[i]))) {
                    map.put(Integer.parseInt(ars[i]), -1);
                } else {
                    map.put(Integer.parseInt(ars[i]), i);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() != -1) {
                    k = entry.getValue()+1;
                    break;
                }
            }
            System.out.println(k);
        }
    }
}