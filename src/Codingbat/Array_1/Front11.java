package Codingbat.Array_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Front11 {
    public static void main(String[] args) {
        int []a={1,7};
        int []b={};
        System.out.println(Arrays.toString(front11(a,b)));
    }
    public static int[] front11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            int[] arr = new int[2];
            for (int i = 0; i < 2; i++) {
                    arr[0] = a[0];
                    arr[1] = b[0];
            }
            return arr;
        }
        if (a.length==0 && b.length>0){
            int[] arr = new int[1];
            for (int i = 0; i < 1; i++) {
                arr[0] = b[0];
            }
            return arr;
        }
        if (a.length>0 && b.length==0){
            int[] arr = new int[1];
            for (int i = 0; i < 1; i++) {
                arr[0] = a[0];
            }
            return arr;
        }
        int []arr = new int[0];
        return arr;
    }
}
