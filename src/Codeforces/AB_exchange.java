package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AB_exchange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            br.readLine();
            String s = br.readLine();
            List<Integer>list =new ArrayList<>();
            for (int i = s.length()-2; i >=0 ; i--) {
                if (!list.contains(i)&&s.charAt(i+1) == 'B' && s.charAt(i) == 'A'){
                    list.add(i);
                    s = s.substring(0,i)+"BA"+s.substring(i+2);
                    i=s.lastIndexOf("B");
                }
            }
            System.out.println(list.size());
        }
    }
}
