package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class Phoenix_and_beauty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pr = new PrintWriter(System.out);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(scanner.nextInt());
            }
            if (set.size() > k) pr.println(-1);
            else {
                pr.println(n*k);
                for (int i = 0; i < n; i++) {
                    for (Integer a : set) pr.print(a + " ");
                    for (int j = 0;j<k-set.size();j++) pr.print("1 ");
                }
                pr.println();
            }
        }
        pr.close();
    }
}
