package Codeforces;

import java.io.*;

public class Prigushaya_lyagushka {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t -->0){
            String []ars = br.readLine().split(" ");
            long a = Long.parseLong(ars[0]);
            long b = Long.parseLong(ars[1]);
            long k = Long.parseLong(ars[2]);
            System.out.println(a*(k/2+k%2)-b*(k/2));
        }
    }
}