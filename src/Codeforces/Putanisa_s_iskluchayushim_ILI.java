package Codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class Putanisa_s_iskluchayushim_ILI {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            st = new StringTokenizer(br.readLine());

            System.out.println(st.nextToken());
        }
    }
}