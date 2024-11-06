package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Slishkom_dlinnoe_slovo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            if (s.length() > 10) {
                System.out.println(s.substring(0, 1) + (s.length() - 2) + s.substring(s.length() - 1, s.length()));
            } else {
                System.out.println(s);
            }
        }
    }
}