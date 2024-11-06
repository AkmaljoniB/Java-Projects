package Codeforces;

import java.io.*;

public class Okrugli_senu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0){
            String s = br.readLine();
            String a = "10000000000";
            System.out.println(Integer.parseInt(s)-Integer.parseInt(a.substring(0,s.length())));
        }
    }
}