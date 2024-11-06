package Codeforces;

import java.io.*;
import java.math.BigInteger;

public class Three_kuchki_s_konfetami {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            String[] ars = br.readLine().split(" ");
            BigInteger a = BigInteger.valueOf(Long.parseLong(ars[0]));
            a = a.add(BigInteger.valueOf(Long.parseLong(ars[1])));
            a = a.add(BigInteger.valueOf(Long.parseLong(ars[2])));
            System.out.println(a.divide(BigInteger.valueOf(2)));
        }
    }
}