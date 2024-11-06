package Codeforces;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Meksimizatsiya {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String n = br.readLine();
            String[] ars = br.readLine().split(" ");
            Map<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < ars.length; i++) {
                int a = Integer.parseInt(ars[i]);
                if (map.containsKey(a)) {
                    map.put(a, map.get(a) + 1);
                } else {
                    map.put(a, 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                pr.print(entry.getKey() + " ");
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue()!=1){
                    for (int i = 1 ; i<entry.getValue();i++){
                        pr.print(entry.getKey() + " ");
                    }
                }
            }
            pr.println();
        }
        pr.close();
    }
}