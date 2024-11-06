package Codeforces;

import java.util.*;

public class Merging_Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),p=0,l=1,max=0;
            Map<Integer,Integer>a=new HashMap<>();
            for(int i=0;i<n;i++){
                int c=sc.nextInt();
                if(p==0)p=c;
                else if(p==c)l++;
                else{
                    a.put(p,Math.max(a.getOrDefault(p,l),l));
                    max=Math.max(max,l);
                    l=1;
                    p=c;
                }
            }
            a.put(p,Math.max(a.getOrDefault(p,l),l));
            max=Math.max(max,l);
            p=0;
            l=1;
            for(int i=0;i<n;i++){
                int c=sc.nextInt();
                if(p==0)p=c;
                else if(p==c)l++;
                else{
                    if(a.containsKey(p))max=Math.max(max,l+a.get(p));
                    else max=Math.max(max,l);
                    l=1;
                    p=c;
                }
            }
            if(a.containsKey(p))max=Math.max(max,l+a.get(p));
            else max=Math.max(max,l);
            System.out.println(max);
        }
    }
}