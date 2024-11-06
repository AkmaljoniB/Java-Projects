package Codeforces;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Obshaya_podposledovatelnost {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            String[] ars1 = br.readLine().split(" ");
            String[] ars2 = br.readLine().split(" ");
            Set<Integer> set1 = new TreeSet<>();
            Set<Integer> set2 = new TreeSet<>();

            for (int i = 0; i < Integer.parseInt(ars[0]); i++) {
                set1.add(Integer.parseInt(ars1[i]));
            }
            for (int i = 0; i < Integer.parseInt(ars[1]); i++) {
                set2.add(Integer.parseInt(ars2[i]));
            }

            Set intersect = set1.stream().filter(set2::contains).collect(Collectors.toSet());
            if (intersect.isEmpty()) {
                System.out.println("NO");
            } else {
                for (Object n : intersect) {
                    System.out.println("YES");
                    System.out.println("1 " + n);
                    break;
                }
            }
        }
        br.readLine();
    }
}