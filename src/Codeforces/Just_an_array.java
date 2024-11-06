package Codeforces;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Just_an_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            Integer[] ar = Arrays.copyOf(arr, n);
            Arrays.sort(ar);
            String s="YES";
            for (int i = 0; i < n; i++) {
                if (!Objects.equals(ar[i], arr[i]) && !BigInteger.valueOf(arr[i]).gcd(BigInteger.valueOf(ar[0])).equals(BigInteger.valueOf(ar[0]))) {
                    s="NO";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
