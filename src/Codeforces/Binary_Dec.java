package Codeforces;

import java.util.*;

public class Binary_Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), s = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) if (sc.nextInt() == 1) list.add(i);
            if (list.size() < s) System.out.println(-1);
            else {
                int l = 0, r = n + 1, p = 0;
                while (list.size() != s) {
                    if (list.get(list.size()-s-1) - l < r - list.get(s)) {
                        p += list.get(0) - l;
                        l = list.get(0);
                        list.remove(0);
                    } else {
                        p += r - list.get(list.size() - 1);
                        r = list.get(list.size() - 1);
                        list.remove(list.size() - 1);
                    }
                }
                System.out.println(p);
            }
        }
    }
}