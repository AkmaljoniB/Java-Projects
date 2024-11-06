package Task;

import java.util.*;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            list.add(arr[i]);
        }
        Collections.sort(list);
        int[] ar1 = new int[list.get(list.size()-1)+1];
        int[] ar2 = new int[list.get(list.size()-1)+1];
        for (int i = 0; i < n; i++) {
            ar1[arr[i]] = 1;
            ar2[arr[i]] = arr[i];
        }
        for (int i = 1; i < ar1.length; i++) {
            ar1[i] += ar1[i - 1];
            ar2[i] += ar2[i - 1];
        }
        int q = scanner.nextInt();
        long sum = 0;
        for (int p = 0; p < n; p++) sum += (long) (p + 1) * list.get(p);
        while (q-- > 0) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int p = arr[i - 1] > j ? 1 : 0;
            int f = list.indexOf(arr[i - 1]);
            long s = sum - (long) arr[i - 1] * (f + 1);
            s += (long) j * (ar1[j] + p);
            s += ar2[arr[i - 1] - p] - ar2[j];
            System.out.println(s);
        }
    }
}