package Codeforces;

import java.util.*;

public class Almost_the_shortest_repeating_substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),p=n;
            String s=sc.next();
            for(int i=1;i<=n/2;i++){
                if(n%i==0){
                    Map<String,Integer>map=new HashMap<>();
                    for(int j=0;j<n;j+=i)map.put(s.substring(j,j+i),map.getOrDefault(s.substring(j,j+i),0)+1);
                    if(map.size()==1){
                        p=i;
                        break;
                    }
                    if(map.size()==2&&((int)map.values().toArray()[0]<2||(int)map.values().toArray()[1]<2)){
                        String q="",w="";
                        for(Map.Entry<String,Integer>entry:map.entrySet()){
                            if(q.equals(""))q=entry.getKey();
                            else w=entry.getKey();
                        }
                        int l=0;
                        for(int j=0;j<q.length();j++)if(q.charAt(j)!=w.charAt(j))l++;
                        if(l<2){
                            p=i;
                            break;
                        }
                    }
                }
            }
            System.out.println(p);
        }
    }
}