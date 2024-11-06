package Codeforces;

import java.io.*;

public class Pokhozhie_stroki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            String res="";
            for (int i=0;i<s.length();i+=2){
                res+=s.substring(i,i+1);
            }
            System.out.println(res);
        }
        br.close();
    }
}