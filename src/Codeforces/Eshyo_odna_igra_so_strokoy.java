package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eshyo_odna_igra_so_strokoy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int k = 0;
        String l = "";
        String s;
        while (t-- > 0) {
            s = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                if (k == 0) {
                    if (s.substring(i, i + 1).equals("a")) l += "b";
                    else l += "a";
                } else {
                    if (s.substring(i, i + 1).equals("z")) l += "y";
                    else l += "z";
                }
                k ^= 1;
            }
            System.out.println(l);
            l="";
            k=0;
        }
    }
}
//interstellar