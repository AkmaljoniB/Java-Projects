package Codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ICPC_shariki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        for (int j=0;j<t;j++){
            int n = scanner.nextInt();
            int k =0;
            Map<String,Integer> map = new HashMap<>();
            String s = scanner.next();
            for (int i = 0 ; i<n;i++) {
                if (map.containsKey(s.substring(i, i + 1))) {
                    k++;
                } else {
                    map.put(s.substring(i,i+1),0);
                    k+=2;
                }
            }
            System.out.println(k);
        }
    }
}