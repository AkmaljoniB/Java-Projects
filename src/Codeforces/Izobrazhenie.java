package Codeforces;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Izobrazhenie {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s;
        Set<String>set = new HashSet<>();
        while (t-- > 0) {
            s = br.readLine();
            set.add(s.substring(0,1));
            set.add(s.substring(1,2));
            s= br.readLine();
            set.add(s.substring(0,1));
            set.add(s.substring(1,2));
            System.out.println(set.size()-1);
            set.clear();
        }
    }
}