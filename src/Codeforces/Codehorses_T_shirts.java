package Codeforces;

import java.util.*;
public class Codehorses_T_shirts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String>list=new ArrayList<>();
        int n=sc.nextInt(),t=n;
        while (n-->0)list.add(sc.next());
        while (t-->0)list.remove(sc.next());
        System.out.println(list.size());
    }
}