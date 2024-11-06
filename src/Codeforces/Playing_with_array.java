package Codeforces;

import java.util.*;

public class Playing_with_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            Long[] arr = new Long[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextLong();
            if (k > 2) System.out.println(0);
            else {
                Arrays.sort(arr);
                long min = arr[0];
                for (int i = 0; i < n - 1; i++) {
                    min = Math.min(arr[i + 1] - arr[i], min);
                }
                if (k == 1) System.out.println(min);
                else {
                    TreeSet<Long> nums = new TreeSet<>(Arrays.asList(arr).subList(0, n));
                    for (int i = 1; i < n; i++) {
                        for (int j = 0; j < i; j++) {
                            long a =arr[i]-arr[j];
                            Long below = nums.floor(a);
                            Long above = nums.ceiling(a);
                            if(below != null) {
                                min = Math.min(min, a - below);
                            }
                            if(above != null) {
                                min = Math.min(min, above - a);
                            }
                        }
                    }
                    System.out.println(min);
                }
            }
        }
    }
}
