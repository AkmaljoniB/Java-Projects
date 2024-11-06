package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Another_division_into_teams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            int b = 0;
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                list.add(a);
                if (b == 0) {
                    if (list.contains(a - 1) || list.contains(a + 1)) b++;
                }
            }
            System.out.println(b == 0 ? 1 : 2);
        }
    }
}
