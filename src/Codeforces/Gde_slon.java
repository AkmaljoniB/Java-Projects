package Codeforces;

import java.io.*;

public class Gde_slon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] arr = new String[8];
            String a1 = br.readLine();
            for (int i = 0; i < 8; i++) {
                arr[i] = br.readLine();
            }
            int k = 0;
            for (int i = 0; i < 7; i++) {
                String s = arr[i];
                arr[i] = arr[i].replace("#", "");
                if (i != 0) {
                    int l = 8, p = 8 - arr[i - 1].length();
                    if (l - arr[i].length() == 1 && p == 2) {
                        System.out.print((i + 1) + " ");
                        for (int j = 1; j < 7; j++) {
                            if (s.substring(j, j + 1).equals("#")) {
                                System.out.println(j + 1);
                                k++;
                                break;
                            }
                        }
                    }
                    if (k == 1) {
                        break;
                    }
                }
            }
        }
    }
}