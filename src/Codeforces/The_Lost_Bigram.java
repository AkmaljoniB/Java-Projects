package Codeforces;

import java.util.Scanner;

public class The_Lost_Bigram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String[] arr = new String[n - 2];
            arr[0] = scanner.next();
            StringBuilder q = new StringBuilder(arr[0]);
            int k=0;
            for (int i = 1; i < n - 2; i++) {
                arr[i] = scanner.next();
                if (!arr[i].substring(0, 1).equals(arr[i - 1].substring(1, 2))) {
                    q.append(arr[i]);
                    k++;
                } else q.append(arr[i].substring(1));
            }
            if (k==0)q.append("b");
            System.out.println(q);
        }
    }
}
