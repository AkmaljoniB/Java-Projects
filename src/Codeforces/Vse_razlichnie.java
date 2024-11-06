package Codeforces;

import java.io.*;
import java.util.*;

public class Vse_razlichnie {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0){
            int n = Integer.parseInt(br.readLine());
            int k = 0;
            Set<String> set = new HashSet<>();
            String[]arr = br.readLine().split(" ");
            for (int i = 0 ; i <n;i++){
                if (set.contains(arr[i])){
                    k++;
                } else {
                    set.add(arr[i]);
                }
            }
            if (k%2==0){
                System.out.println(n-k);
            } else {
                System.out.println(n-k-1);
            }
        }
    }
}