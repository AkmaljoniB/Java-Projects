package Codingbat.Array_1;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        for (int i = 0; i < 2; i++) {
            if (a[0] + a[1] > b[0] + b[1]) {
                return a;
            }
            if (a[0] + a[1] < b[0] + b[1]) {
                return b;
            }
        }
        return a;
    }
}
