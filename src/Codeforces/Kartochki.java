package Codeforces;

import java.io.*;

public class Kartochki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int[] arr = new int[5];
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("z")) {
                arr[0]++;
            } else if (s.substring(i, i + 1).equals("e")) {
                arr[1]++;
            } else if (s.substring(i, i + 1).equals("r")) {
                arr[2]++;
            } else if (s.substring(i, i + 1).equals("o")) {
                arr[3]++;
            } else if (s.substring(i, i + 1).equals("n")) {
                arr[4]++;
            }
        }
        int min_one = Math.min(Math.min(arr[3], arr[4]), arr[1]);
        arr[3] -= min_one;
        arr[1] -= min_one;
        while (min_one --> 0) {
            System.out.print(1 + " ");
        }
        int min_zero = Math.min(Math.min(arr[0], arr[1]), Math.min(arr[2], arr[3]));
        while (min_zero --> 0) {
            System.out.print(0 + " ");
        }
    }
}