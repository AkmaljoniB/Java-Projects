package Codeforces;

import java.util.Scanner;

public class Even_and_odd_additions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            Integer[] arr = new Integer[n];
            int j = 0, toq = 0;
            long s = 0;
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                s += a;
                arr[i] = a % 2;
                if (arr[i] == 0) j++;
                else toq++;
            }
            for (int i = 0; i < q; i++) {
                int type = scanner.nextInt();
                int x = scanner.nextInt();
                if (type == 0) {
                    s += x * j;
                    if (x % 2 != 0) {
                        toq += j;
                        j = 0;
                    }
                } else {
                    s+=x*toq;
                    if (x%2!=0){
                        j +=toq;
                        toq=0;
                    }
                }
                System.out.println(s);
            }
        }
    }
}
