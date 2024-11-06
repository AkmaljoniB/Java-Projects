package Codeforces;

import java.util.Scanner;

public class Alphabetical_deletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        char[] arr = scanner.next().toCharArray();
        out:
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] - 'a' == i) {
                    k--;
                    arr[j] = ' ';
                    if (k == 0) break out;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != ' ') System.out.print(arr[i]);
        }
    }
}
