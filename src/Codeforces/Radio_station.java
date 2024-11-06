package Codeforces;

import java.util.*;

public class Radio_station {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        Map<String,String> map=new HashMap<>();
        for (int i=0;i<n;i++) {
            String s=sc.next();
            map.put(sc.next(),s);
        }
        for (int i=0;i<m;i++) {
            String s=sc.next(),p=sc.next();
            System.out.println(s+" "+p+" #"+map.get(p.substring(0,p.length()-1)));
        }
    }
}
