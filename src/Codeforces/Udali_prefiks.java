package Codeforces;

import java.io.*;
import java.util.*;

public class Udali_prefiks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] ars = br.readLine().split(" ");
            Set<String>set = new HashSet<>();
            int k =0;
            for (int i = n-1 ; i >=0;i--){
                if (set.contains(ars[i])){
                    k = i+1;
                    break;
                } else {
                    set.add(ars[i]);
                }
            }
            System.out.println(k);
        }
    }
}