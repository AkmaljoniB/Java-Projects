package Codeforces;

import java.io.*;

public class Doska_s_domino {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while (t-->0){
            int n = Integer.parseInt(br.readLine());
            String s= br.readLine();
            s = s.replace("U", "5");
            s = s.replace("D","U");
            s = s.replace("5","D");
            System.out.println(s);
        }
    }
}