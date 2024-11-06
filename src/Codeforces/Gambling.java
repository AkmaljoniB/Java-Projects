package Codeforces;

import java.util.*;

public class Gambling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),max=0,p=sc.nextInt(),f=0,q=0;
            Map<Integer, List<Integer>>map=new HashMap<>();
            map.put(p,new ArrayList<>());
            map.get(p).add(0);
            for(int i=1;i<n;i++){
                int a=sc.nextInt();
                if(!map.containsKey(a))map.put(a,new ArrayList<>());
                map.get(a).add(i);
            }
            for(Map.Entry<Integer,List<Integer>>entry:map.entrySet()){
                int l=1,j=entry.getValue().get(0);
                for(int i=1;i<entry.getValue().size();i++){
                    if(entry.getValue().get(i)-entry.getValue().get(i-1)==1){
                        l++;
                        if(max<l){
                            max=l;
                            p=entry.getKey();
                            f=j;
                            q=entry.getValue().get(i);
                        }
                    } else {
                        l-=entry.getValue().get(i)-entry.getValue().get(i-1)-2;
                        if(l<1) {
                            l=1;
                            j=entry.getValue().get(i);
                        }
                    }
                }
            }
            System.out.println(p +" "+(f+1)+" "+(q+1));
        }
    }
}