package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Igra_s_fishkoy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0){
            String[]ars = br.readLine().split(" ");
            int a = Integer.parseInt(ars[0]);
            int b = Integer.parseInt(ars[1]);
            System.out.println(a%2==b%2?"Tonya":"Burenka");
        }
    }
}