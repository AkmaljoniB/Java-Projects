package Codeforces;

import java.util.*;

public class Remove_first_or_second_character{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),res=0;
            String s=sc.next();
            Set<String>set=new HashSet<>();
            for(int i=0;i<n;i++){
                if(!set.contains(s.charAt(i)+""))res+=n-i;
                set.add(s.charAt(i)+"");
            }
            System.out.println(res);
        }
    }
}