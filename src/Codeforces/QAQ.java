package Codeforces;

import java.io.*;

public class QAQ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i,i+1).equals("Q") && i!=s.length()-2) {
                for (int j = i+1; j < s.length(); j++) {
                    if (s.substring(j,j+1).equals("A")){
                        for (int l = j+1; l < s.length(); l++) {
                            if (s.substring(l,l+1).equals("Q")){
                                k++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(k);
    }
}