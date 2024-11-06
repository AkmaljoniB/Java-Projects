package Codingbat.Recursion_1;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        long e = 0;
        int a = 0, b = 1, c = 0;
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        e = c;
        if (n == 1) {
            return 1;
        }
        return Math.toIntExact(e);
    }
}