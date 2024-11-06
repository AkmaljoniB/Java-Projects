package Codeforces;

import java.io.*;

public class Pochti_pryamougolnik {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] ars = new String[n];
            int l1 = -1, l2, k = 0, p = 0;
            for (int i = 0; i < n; i++) {
                ars[i] = br.readLine();
                if (p == 1) {
                    ars[i] = ars[k];
                    p++;
                } else if (n - ars[i].replace("*", "").length() == 2) {
                    k = i;
                    if (k != 0) {
                        ars[0] = ars[i];
                    } else {
                        p++;
                    }
                } else if (p == 0 && ars[i].contains("*")) {
                    if (l1 == -1) {
                        l1 = ars[i].indexOf("*");
                        k = i;
                    } else {
                        l2 = ars[i].indexOf("*");
                        if (l1 == l2) {
                            if (l1 == 0) {
                                ars[i] = "**".concat(ars[i].substring(2));
                            } else {
                                ars[i] = ars[i].substring(0, l2 - 1) + "*" + ars[i].substring(l2);
                            }
                        } else {
                            ars[i] = ars[i].substring(0, l1) + "*" + ars[i].substring(l1 + 1);
                        }
                        ars[k] = ars[i];
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(ars[i]);
            }
        }
    }
}