package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Changing_bits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringBuilder a = new StringBuilder(br.readLine());
            String b = br.readLine();
            String s = "YES";
            int k = 0;
            if (!b.contentEquals(a)) {
                for (int i = a.length() - 1; i >= 0; i--) {
                    if (k == 0 && !a.substring(i, i + 1).equals(b.substring(i, i + 1))) {
                        int l = a.substring(0, i + 1).replace("0", "").length();
                        if (i + 1 - l == l) k ^= 1;
                        else {
                            s = "NO";
                            break;
                        }
                    } else if (a.substring(i, i + 1).equals(b.substring(i, i + 1)) && k == 1) {
                        int l = a.substring(0, i + 1).replace("0", "").length();
                        if (i + 1 - l == l) k ^= 1;
                        else {
                            s = "NO";
                            break;
                        }
                    }
                }
            }
            System.out.println(s);
        }
    }
}