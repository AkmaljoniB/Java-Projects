package Codeforces;

import java.util.*;

public class Note_Toms_Reddle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<String>set=new HashSet<>();
        while(n-->0){
            String p=sc.next();
            System.out.println(set.contains(p)?"YES":"NO");
            set.add(p);
        }
    }
}