package Alexeev;

import java.util.Scanner;

public class Alexeev_0711 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals(" ")) {
                n = Integer.parseInt(s.substring(0, i));
                break;
            }
        }
        String[] arr = new String[n];
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            String d = "";
            arr[i] = scanner.nextLine();
            String a = scanner.nextLine();
            for (int j = 0; j < a.length(); j++) {
                if (!a.substring(j, j + 1).equals(" ")) {
                    d = d.concat(a.substring(j, j + 1));
                } else {
                    ar[i] = ar[i] + Integer.parseInt(d);
                    d = "";
                }
            }
            ar[i] = ar[i] + Integer.parseInt(d);
        }
        int min =ar[0],a=0;
        for (int i = 0; i < n; i++) {
            if (min >= ar[i]) {
                min = ar[i];
                a=i;
            }
        }
        System.out.println(arr[a]);
    }
}