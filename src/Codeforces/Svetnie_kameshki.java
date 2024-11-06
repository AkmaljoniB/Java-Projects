package Codeforces;

import java.io.*;

public class Svetnie_kameshki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        int k = 0, i = 0;
        for (int j = 0; j < t.length(); j++) {
            if (s.substring(i, i + 1).equals(t.substring(j, j + 1))) {
                k++;
                t = t.substring(j + 1);
                i++;
                j = -1;
            }
        }
        System.out.println(k + 1);
    }
}