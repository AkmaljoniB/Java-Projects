package Codeforces;

import java.io.*;

public class Eshyo_zadacha_pro_knizhnuyu_polku {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s =br.readLine();
            s=s.replace(" ","");
            for (int i = 0; i < s.length(); i++) {
                if (s.substring(i,i+1).equals("1")) {
                    s=s.substring(i);
                    break;
                }
            }
            for (int i = s.length()-1;i>=0;i--){
                if (s.substring(i,i+1).equals("1")){
                    s =s.substring(0,i+1);
                    break;
                }
            }
            int l = s.length();
            s = s.replace("0","");
            System.out.println(l-s.length());
        }
    }
}