package Codingbat.Ap_1;

import java.util.Arrays;

public class CommonTwo {
    public static void main(String[] args) {
        String[]arr = {"a", "a", "b", "b", "c"};
        String[]arr1 = {"b", "b", "b", "x"};
        System.out.println(commonTwo(arr,arr1));
    }
    public static int commonTwo(String[] a, String[] b) {
        int d = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        int a1 = 0, b1 = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i].equals(a[i + 1])) {
                a1++;
            }
        }
        for (int i = 0; i < b.length-1; i++) {
            if (b[i].equals(b[i + 1])) {
                b1++;
            }
        }
        String a2[] = new String[a.length-a1];
        String b2[] = new String[b.length-b1];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = "";
        }
        for (int i = 0; i < b2.length; i++) {
            b2[i] = "";
        }
        for (int i = 0; i < a.length-1; i++) {
            if (!a[i].equals(a[i + 1])) {
                for (int j = 0; j < a2.length; j++) {
                    if (a2[j].equals("")) {
                        a2[j] = a[i];
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < b.length-1; i++) {
            if (!b[i].equals(b[i + 1])) {
                for (int j = 0; j < b2.length; j++) {
                    if (b2[j].equals("")) {
                        b2[j] = b[i];
                        break;
                    }
                }
            }
        }
        if (b2[b2.length-1].equals("")){
            b2[b2.length-1]=b[b.length-1];
        }
        if (a2[a2.length-1].equals("")){
            a2[a2.length-1]=a[a.length-1];
        }
        for (int j = 0; j < b2.length; j++) {
            for (int i = 0; i < a2.length; i++) {
                if (a2[i].equals(b2[j])) {
                    d++;
                }
            }
        }
        return d;
    }
}
