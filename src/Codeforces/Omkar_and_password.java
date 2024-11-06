package Codeforces;

import java.util.*;

public class Omkar_and_password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++)set.add(sc.nextInt());
            System.out.println(set.size()==1?n:1);
        }
    }
}