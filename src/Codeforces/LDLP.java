package Codeforces;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LDLP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Integer,String> map=new TreeMap<>();
        for (int i=0;i<s.length();i++) map.put(s.charAt(i)-'a',map.getOrDefault(s.charAt(i)-'a',"").concat(s.substring(i,i+1)));
        System.out.println(map.values().toArray()[map.size()-1]);
    }
}