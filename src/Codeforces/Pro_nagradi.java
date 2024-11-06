package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro_nagradi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sa = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int sb = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        n -= sa / 5;
        n -= sb / 10;
        if (sa % 5 != 0) {
            n--;
        }
        if (sb % 10 != 0) {
            n--;
        }
        if (n>=0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}