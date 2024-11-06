package Codingbat.Array_1;

public class PlusTwo {
    public int[] plusTwo(int[] a, int[] b) {
        int []arr = new int[a.length*2];
        for (int i = 0; i < a.length; i++){
            arr[i]=a[i];
            arr[i+2]=b[i];
        }
        return arr;
    }
}
