package Codeforces;

import java.io.*;

public class Avtobus_v_Udayland {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s = "";
        while (t-- > 0) {
            s +=br.readLine()+"\n";
        }
        String s1 =s.replaceFirst("OO","++");
        if (s1.equals(s)){
            System.out.println("NO");
        }  else {
            System.out.println("YES");
            System.out.println(s1);
        }
    }
}