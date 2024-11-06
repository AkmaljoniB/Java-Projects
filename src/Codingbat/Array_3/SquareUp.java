package Codingbat.Array_3;

import java.util.Arrays;

public class SquareUp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareUp(3)));
    }

    public static int[] squareUp(int n) {
        int[] arr = new int[n * n];
        int p =n;
        for (int i = n * n - 1; i >= 0; i--) {
            for (int k = p - 1; k >= 0; k--) {
                arr[i] = p - k;
                i--;
            }
            i=i-(n-p);
            p--;
            i++;
        }
        return arr;
    }
}