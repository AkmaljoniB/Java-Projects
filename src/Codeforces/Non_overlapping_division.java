package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Non_overlapping_division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            scanner.nextInt();
            String s = scanner.next();
            Set<String> set1 = new HashSet<>();
            int max = 0;
            for (int i = 0; i < s.length(); i++) {
                if (set1.contains(s.substring(i, i + 1))) {
                    Set<String> set2 = new HashSet<>();
                    int l = i;
                    for (int j = i; j < s.length(); j++) set2.add(s.substring(j, j + 1));
                    max = set1.size() + set2.size();
                    int o =300;
                    while (o-->0) {
                        int p = 0;
                        for (int j = l; j < s.length(); j++) {
                            String q = s.substring(j, j + 1);
                            if (!s.substring(j + 1).contains(q)) set2.remove(q);
                            if (set1.contains(q)){
                                p=j+1;
                                break;
                            } else {
                                set1.add(s.substring(j, j + 1));
                                max = Math.max(set1.size()+set2.size(),max);
                            }
                        }
                        if (p == 0) break;
                        l = p;
                    }
                    break;
                } else set1.add(s.substring(i, i + 1));
            }
            System.out.println(Math.max(max, set1.size()));
        }
    }
}
