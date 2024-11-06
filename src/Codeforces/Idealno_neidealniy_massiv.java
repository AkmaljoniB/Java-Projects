package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Idealno_neidealniy_massiv {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] ars = br.readLine().split(" ");
            String b ="NO";
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(ars[i]);
                if (Math.sqrt(a)!=(int)Math.sqrt(a)){
                    b ="YES";
                    break;
                }
            }
            System.out.println(b);
        }
    }
}