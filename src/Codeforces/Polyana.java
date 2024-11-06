package Codeforces;

import java.io.*;

public class Polyana {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] ars;

        while (t-- > 0) {
            int k = 0;
            ars = br.readLine().split(" ");

            if (ars[0].equals("1")) k++;
            if (ars[1].equals("1")) k++;
            ars = br.readLine().split(" ");

            if (ars[0].equals("1")) k++;
            if (ars[1].equals("1")) k++;
            System.out.println(k == 1 ? k : k / 2);
        }
    }
}