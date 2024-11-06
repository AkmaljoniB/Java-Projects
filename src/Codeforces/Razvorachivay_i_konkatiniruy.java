package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Razvorachivay_i_konkatiniruy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            String s = br.readLine();
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            int l = 2;
            if (s.contentEquals(sb)||Integer.parseInt(ars[1])==0){
                l = 1;
            }
            System.out.println(l);
        }
    }
}