package Codingbat.Array_1;

public class MiddleWay {
    public int[] middleWay(int[] a, int[] b) {
        int[] arr = new int[2];
        for (int i = 0; i < 3; i++) {
            arr[0]=a[1];
            arr[1]=b[1];
        }
        return arr;
    }
}
