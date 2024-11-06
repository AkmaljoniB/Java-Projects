package Alexeev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alexeev_0272 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]ars = br.readLine().split(" ");
        int max = Integer.MIN_VALUE, min =  Integer.MAX_VALUE;
        for (int i = 0; i < ars.length; i++) {
            if (i % 2 == 1) max = Math.max(max, Integer.parseInt(ars[i]));
            else min = Math.min(min, Integer.parseInt(ars[i]));
        }
        System.out.println(max + min);
    }
}