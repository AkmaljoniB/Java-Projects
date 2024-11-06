package Alexeev;

import java.io.*;
import java.util.StringTokenizer;

public class Alexeev_0041 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ar = new int[202];
        while (st.hasMoreTokens())++ar[Integer.parseInt(st.nextToken()) + 100];
        for (int i = 0; i < 202; i++) {
            for (int j = 0; j < ar[i]; j++) {
                pr.print((i - 100) + " ");
            }
        }
        pr.close();
    }
}