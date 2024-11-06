package Codeforces;

import java.util.Scanner;

public class AntiSudoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String[] arr = new String[9];
            int k = 0, l = 0;
            for (int i = 0; i < 9; i++) {
                arr[i] = scanner.next();
                if (i<6) {
                    arr[i] = arr[i].substring(0, k + l) + arr[i].charAt(k + 1 + l) + arr[i].substring(k + 1 + l);
                    k += 3;
                    if ((i + 1) % 3 == 0) {
                        k = 0;
                        l++;
                    }
                } else {
                    k+=3;
                    l=1;
                    arr[i] = arr[i].substring(0, k - l) + arr[i].charAt(k  - l-1) + arr[i].substring(k );
                }
                System.out.println(arr[i]);
            }
        }
    }
}
//1 5 4   8 7 3   3.9 6
//3 3.6   5 9 2   7 1 4
//7 2 9   6 4 5.  8 3 5

//8 6 3   7 2 5   1 4 5.
//9 7 9.  3 1 4   6 2 8
//4 1 2   9 5.8   3 5 7

//6 3 1   4 5 7   9 9.2
//9.9 8   2 3 6   4 7 1
//2 4 7   7.8 9   5 6 3
