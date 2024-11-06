package Codingbat.Ap_1;

import java.util.Arrays;

public class MergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] arr = new String[a.length + b.length];
        String s[] = new String[n];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            arr[i + a.length] = b[i];
        }
        Arrays.sort(arr);
        int d =0;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals(arr[i+1])){
                d++;
            }
            s[i]=arr[i+d];
        }
        return s;
    }
}
