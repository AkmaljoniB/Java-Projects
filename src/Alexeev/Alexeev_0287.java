package Alexeev;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Alexeev_0287 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        String s=sc.next();
        Set<String>set=new HashSet<>();
        for (int i=0;i<=n-m;i++)set.add(s.substring(i,i+m));
        System.out.println(set.size());
    }
}