package Codeforces;

import java.util.*;

public class Unichtojenie_Massive {
    public static Integer[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        outer:
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            arr = new Integer[2 * n];
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int j = 0; j < 2 * n; j++) {
                arr[j] = sc.nextInt();
                if (count.get(arr[j]) == null) {
                    count.put(arr[j], 1);
                } else {
                    count.put(arr[j], count.get(arr[j]) + 1);
                }
            }
            Arrays.sort(arr, Collections.reverseOrder());
            count.put(arr[0], count.get(arr[0]) - 1);
            loop:
            for (int p = 2 * n - 1; p > 0; p--) {
                int tar = arr[0];
                int[][] res = new int[n][2];
                res[0][0] = arr[0];
                HashMap<Integer, Integer> hashMap = (HashMap<Integer, Integer>) count.clone();
                int index = 0;
                res[index++][1] = arr[p];
                boolean flag = false;
                hashMap.put(arr[p], hashMap.get(arr[p]) - 1);
                for (int i = 1; i < 2 * n; i++) {
                    if (index == n) {
                        flag = true;
                        break;
                    }
                    if (hashMap.get(arr[i]) == 0) continue;
                    int q = binSearch(tar - arr[i]);
                    if (q == -1) {
                        continue loop;
                    }
                    if (hashMap.get(arr[q]) == 0 || hashMap.get(arr[i]) == 0 || arr[i] == arr[q] && hashMap.get(arr[i]) < 2) {
                        continue loop;
                    }
                    res[index][0] = arr[i];
                    res[index++][1] = arr[q];
                    hashMap.put(arr[i], hashMap.get(arr[i]) - 1);
                    hashMap.put(arr[q], hashMap.get(arr[q]) - 1);
                    tar = arr[i];
                }

                if (flag) {
                    System.out.println("YES");
                    System.out.println(res[0][0] + res[0][1]);
                    for (int i = 0; i < n; i++) {
                        System.out.println(res[i][0] + " " + res[i][1]);
                    }
                    continue outer;
                }
            }
            System.out.println("NO");
        }
    }

    public static int binSearch(int t) {
        if (arr == null || arr.length == 0)
            return -1;

        int l = 0, r = arr.length - 1;
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] > t) {
                l = mid;
            } else {
                r = mid;
            }
        }
        if (arr[l] == t) return l;
        if (arr[r] == t) return r;
        return -1;
    }
}