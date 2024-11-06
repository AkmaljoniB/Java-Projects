package Codingbat.Ap_1;


public class SumHeights {
    public static void main(String[] args) {
        System.out.println(sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
    }

    public static int sumHeights(int[] heights, int start, int end) {
        int s = 0;
        for (int i = start; i < end; i++) {
            s = s + Math.abs(heights[i] - heights[i + 1]);
        }
        return s;
    }
}
