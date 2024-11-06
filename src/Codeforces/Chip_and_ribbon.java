package Codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Chip_and_ribbon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Integer> list = new LinkedList<>();
            long s = 0;
            int k = 0;
            for (int i = 0; i < n; i++) {
                list.add(scanner.nextInt());
                s += list.get(i);
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != 0) {
                    list.set(i, list.get(i) - 1);
                    s--;
                } else if (s != 0) k++;
                if (s == 0) break;
                if (i == list.size() - 1) {
                    for (int j = 0; j < list.size(); j++) {
                        if (list.get(j) == 0) list.remove(j);
                        else break;
                        j--;
                    }
                    for (int j = list.size() - 1; j >= 0; j--) {
                        if (list.get(j) == 0) list.remove(j);
                        else break;
                    }
                    k++;
                    i=-1;
                }
            }
            System.out.println(k);
        }
    }
}
