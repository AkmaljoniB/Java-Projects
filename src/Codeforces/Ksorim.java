package Codeforces;

import java.io.*;

public class Ksorim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            int a = Integer.parseInt(ars[0]);
            int b = Integer.parseInt(ars[1]);
            pr.println(a ^ b);
        }
        pr.close();
        br.close();
    }
}