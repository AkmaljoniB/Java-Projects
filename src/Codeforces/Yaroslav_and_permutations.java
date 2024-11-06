package Codeforces;

import java.util.*;

public class Yaroslav_and_permutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer> map=new TreeMap<>();
        for (int i=0;i<n; i++) {
            int a=sc.nextInt();
            map.put(a,map.getOrDefault(a,0)+1);
        }
        String s="YES";
        for (Map.Entry<Integer,Integer>entry:map.entrySet()){
            if (n-entry.getValue()<entry.getValue()&&entry.getValue()-(n-entry.getValue())>1){
                s="NO";
                break;
            }
        }
        System.out.println(s);
    }
}
