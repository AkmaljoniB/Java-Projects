package Codeforces;

import java.io.*;

public class Strannie_funksii {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String s = br.readLine();
            System.out.println(s.length());
        }
    }
}