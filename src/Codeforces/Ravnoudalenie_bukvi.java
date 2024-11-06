package Codeforces;

import java.io.*;
import java.util.Arrays;

public class Ravnoudalenie_bukvi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            char[]a = s.toCharArray();
            Arrays.sort(a);
            System.out.println(a);
        }
    }
}