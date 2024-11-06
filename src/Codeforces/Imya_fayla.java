package Codeforces;

import java.io.*;

public class Imya_fayla {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        String s =br.readLine();
        int k =0;
        for (int i=0;i<s.length()-2;i++){
            if (s.substring(i,i+3).equals("xxx")){
                k++;
                s=s.substring(0,i).concat(s.substring(i+1));
                i--;
            }
        }
        System.out.println(k);
    }
}