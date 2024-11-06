package Codeforces;

import java.util.*;

public class Nastya_and_the_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)set.add(sc.nextInt());
        set.remove(0);
        System.out.println(set.size());
    }
}