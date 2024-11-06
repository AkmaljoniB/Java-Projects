package Codeforces;

import java.io.*;
import java.util.*;

public class Polikarp_pishet_stroku_po_pamyati {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            Set<String> set = new HashSet<>();
            int k = 0;
            for (int i = 0; i < s.length(); i++) {
                set.add(s.substring(i, i + 1));
                if (set.size() > 3) {
                    k++;
                    set.clear();
                    set.add(s.substring(i,i+1));
                }
            }
            System.out.println(set.size() != 0 ? k + 1 : k);
        }
    }
}