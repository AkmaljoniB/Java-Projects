package Codeforces;

import java.util.*;

public class Vlad_and_separation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            HashMap<Integer,Integer> m = new HashMap<>();
            int max=2147483647,ans=0;
            for(int i=0;i<n;i++) {
                if(!m.containsKey(a[i]))m.put(a[i],0);
                int c=Math.abs(a[i]-max);
                if(!m.containsKey(c))m.put(c,0);
                if(m.get(c)>0) {
                    m.put(c,m.get(c)-1);
                    if(m.get(c) == 0) m.remove(c);
                }else {
                    ans++;
                    m.put(a[i],m.get(a[i])+1);
                }
            }
            System.out.println(ans);
        }
    }
}