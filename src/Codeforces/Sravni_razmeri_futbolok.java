package Codeforces;

import java.io.*;
import java.util.*;

public class Sravni_razmeri_futbolok {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            Map<String, Integer> map = new HashMap<>();
            map.put("S", 0);
            map.put("M", 50);
            map.put("L", 100);
            int a = map.get(ars[0].substring(ars[0].length() - 1));
            int b = map.get(ars[1].substring(ars[1].length() - 1));
            if (a == 0) a -= (ars[0].length() - 1) * 10;
            else a += (ars[0].length() - 1) * 10;

            if (b == 0) b -= (ars[1].length() - 1) * 10;
            else b += (ars[1].length() - 1) * 10;

            if (a > b) {
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
    }
}