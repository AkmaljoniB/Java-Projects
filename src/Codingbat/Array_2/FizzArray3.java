package Codingbat.Array_2;

public class FizzArray3 {
    public static void main(String[] args) {
        System.out.println(fizzArray3(5,10));
    }

    public static int[] fizzArray3(int start, int end) {
        int[]arr = new int[end-start];
        for (int i = start; i < end;i++){
            arr[i-start] = i;
        }
        return arr;
    }
}
