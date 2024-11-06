package Codeforces;

import java.util.*;

public class Hearing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),o=1;
        long s=0;
        int[]arr=new int[n+1],ars=new int[n+1];
        Map<Integer,List<Integer>> map=new HashMap<>();
        for (int i=1;i<=n;i++)arr[i]=sc.nextInt();
        while (m-->0){
            int x=sc.nextInt(),y=sc.nextInt();
            if(ars[x]==0&&ars[y]==0){
                ars[x]=ars[y]=o;
                map.put(o,new ArrayList<>());
                map.get(o).add(x);
                map.get(o).add(y);
                o++;
            }else if(ars[x]==0){
                map.get(ars[y]).add(x);
                ars[x]=ars[y];
            }else if(ars[y]==0){
                map.get(ars[x]).add(y);
                ars[y]=ars[x];
            }else if(ars[x]!=ars[y]){
                int max=ars[y],min=ars[x];
                if(map.get(ars[x]).size()>map.get(ars[y]).size()){
                    max=ars[x];
                    min=ars[y];
                }
                for(int i=0;i<map.get(min).size();i++){
                    map.get(max).add(map.get(min).get(i));
                    ars[map.get(min).get(i)]=max;
                }
                map.remove(min);
            }
        }
        for(int i=1;i<=n;i++)if(ars[i]==0)s+=arr[i];
        for (Map.Entry<Integer,List<Integer>>entry:map.entrySet()){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<entry.getValue().size();i++)min=Math.min(arr[entry.getValue().get(i)],min);
            s+=min;
        }
        System.out.println(s);
    }
}