package Codeforces;

import java.util.*;

public class Exchange_dilemma{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Map<Integer,Integer>m1=new HashMap<>();
            Map<Integer,Integer>m2=new HashMap<>();
            Map<Integer,Integer>map=new HashMap<>();
            int[]a=new int[n],b=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                m1.put(a[i],m1.getOrDefault(a[i],0)+1);
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
                m2.put(b[i],m2.getOrDefault(b[i],0)+1);
                map.put(b[i],i);
            }
            String s="NO";
            if(m1.equals(m2)){
                int l=0;
                for(int i=0;i<n;i++){
                    if(a[i]!=b[i]){
                        l++;
                        int p=b[i];
                        b[i]=a[i];
                        b[map.get(a[i])]=p;
                        map.put(p,map.get(b[i]));
                    }
                }
                if(l%2==0)s="YES";
            }
            System.out.println(s);
        }
    }
}