package Codeforces;

import java.io.*;
import java.util.Arrays;

public class Perestanovka_podposledovatelnosti {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String n = br.readLine();
            String s = br.readLine();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            int k=0;
            for (int i = 0; i < s.length();i++){
                if (!s.substring(i,i+1).equals(String.valueOf(arr[i]))){
                    k++;
                }
            }
            System.out.println(k);
        }
    }
}
