package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dva_krolika {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer sb = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(sb.nextToken());
            int y = Integer.parseInt(sb.nextToken());
            int a = Integer.parseInt(sb.nextToken());
            int b = Integer.parseInt(sb.nextToken());
            String s = "-1";
            if ((y - x) % (a + b) == 0){
                s = String.valueOf((y - x) / (a + b));
            }
            System.out.println(s);
        }
    }
}