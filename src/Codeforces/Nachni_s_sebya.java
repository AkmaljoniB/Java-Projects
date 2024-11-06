package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Nachni_s_sebya {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k=-1;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n= Integer.parseInt(st.nextToken());
            int m= Integer.parseInt(st.nextToken());
            String s;
            for(int i = 0; i < n-1; i++){
                s = br.readLine();
                if(s.substring(m-1).equals("R")) k++;
            }
            s = br.readLine();
            s= s.replace("R","");
            System.out.println(k+s.length());
        }
    }
}