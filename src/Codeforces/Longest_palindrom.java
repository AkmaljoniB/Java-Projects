package Codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Longest_palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<String> list = new LinkedList<>();
        String s = "", p = "";
        for (int i = 0; i < n; i++) list.add(scanner.next());
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(list.get(i));
            sb.reverse();
            String a = list.get(i);
            list.remove(list.get(i));
            if (list.contains(String.valueOf(sb))) {
                list.remove(String.valueOf(sb));
                s = s.concat(String.valueOf(sb.reverse()));
            } else if (a.contentEquals(sb)) p = a;
            list.add(0,a);
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(2 * s.length() + p.length());
        System.out.println(s + p + sb);
    }
}
