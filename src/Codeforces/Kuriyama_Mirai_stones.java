package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Kuriyama_Mirai_stones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Long[] arr = new Long[n + 1];
        Long[] arrsort1 = new Long[n + 1];
        int[] arrsort = new int[n + 1];
        arr[1] = scanner.nextLong();
        arrsort[1] = Math.toIntExact(arr[1]);
        for (int i = 2; i <= n; i++) {
            int a = scanner.nextInt();
            arr[i] = arr[i - 1] + a;
            arrsort[i] = a;
        }
        Arrays.sort(arrsort);
        arrsort1[0] = 0L;
        arrsort1[1] = (long) arrsort[1];
        for (int i = 2; i <= n; i++) {
            arrsort1[i] = (long) arrsort[i] + arrsort1[i - 1];
        }
        int m = scanner.nextInt();
        while (m-- > 0) {
            int type = scanner.nextInt();
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt();
            if (l == 0) System.out.println(type == 1 ? arr[r] : arrsort1[r]);
            else System.out.println(type == 1 ? arr[r] - arr[l] : arrsort1[r] - arrsort1[l]);
        }
    }
}
