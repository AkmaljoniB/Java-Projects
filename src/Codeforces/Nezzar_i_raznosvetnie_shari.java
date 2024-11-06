package Codeforces;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Nezzar_i_raznosvetnie_shari {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String n = br.readLine();
            String[] ars = br.readLine().split(" ");
            int max= 0;
            Map<String,Integer> map = new HashMap<>();
            for (int i = 0; i < ars.length; i++) {
                if (map.containsKey(ars[i])) {
                    map.put(ars[i],map.get(ars[i])+1);
                } else {
                    map.put(ars[i],1);
                }
            }
            for (Map.Entry<String,Integer>entry : map.entrySet()){
                max = Math.max(max,entry.getValue());
            }
            System.out.println(max);
        }
    }
}