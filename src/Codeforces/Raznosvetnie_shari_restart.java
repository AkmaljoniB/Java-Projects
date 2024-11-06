package Codeforces;

import java.io.*;

public class Raznosvetnie_shari_restart {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String n = br.readLine();
            String[] ars = br.readLine().split(" ");
            int j = 0;
            for (int i = 1; i < ars.length; i++) {
                if (Integer.parseInt(ars[i]) > Integer.parseInt(ars[j])) {
                    j = i;
                }
            }
            System.out.println(j + 1);
        }
    }
}