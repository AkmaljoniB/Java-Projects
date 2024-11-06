package Massive;

import java.util.Arrays;

public class Massive_5 {
    public static void main(String[] args) {
        Massive_5 arr = new Massive_5();
        arr.evenArray(10);
    }

    private int[] evenArray(int number) {
        int[] array = new int[number + 1];
        int[] array3;
        int count = 0;

        for (int i = 1; i <= array.length - 1; i++) {
            if (i % 2 == 0) {
                array[i] = 1;
                count++;
            }
        }
        array3 = Arrays.stream(array).filter(i -> i != 0).toArray();

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array3));

        return array3;
    }
}
