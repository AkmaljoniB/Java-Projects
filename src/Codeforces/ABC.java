package Codeforces;

import java.io.*;

public class ABC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int k = 0;
            String YN="YES";
            for (int i = 0; i < n-1; i++) {
                for (int j = i+2; j <= n; j++) {
                    String s1 = s.substring(i,j);
                    StringBuilder s2 = new StringBuilder(s1);
                    s2.reverse();
                    if (s1.contentEquals(s2)){
                        YN = "NO";
                        k++;
                        break;
                    }
                }
                if (k==1){
                    break;
                }
            }
            System.out.println(YN);
        }
    }
}