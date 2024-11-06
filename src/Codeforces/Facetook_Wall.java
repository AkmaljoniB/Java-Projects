package Codeforces;

import java.util.*;

public class Facetook_Wall{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.nextLine();
        Map<String,Integer>map=new HashMap<>();
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String f=sc.nextLine();
            int l=0;
            if(f.startsWith(p+" ")) {
                if(f.endsWith("wall"))l=15;
                else if(f.substring(f.indexOf(" ")+1).startsWith("commented"))l=10;
                else l=5;
                f=f.substring(0,f.length()-7);
                f=f.substring(f.lastIndexOf(" ")+1);
            }else if(f.substring(0,f.length()-7).substring(f.substring(0,f.length()-7).lastIndexOf(" ")+1).equals(p)){
                if(f.endsWith("wall"))l=15;
                else if(f.substring(f.indexOf(" ")+1).startsWith("commented"))l=10;
                else l=5;
                f=f.substring(0,f.indexOf(" "));
            }else{
                if(!map.containsKey(f.substring(0,f.indexOf(" "))))map.put(f.substring(0,f.indexOf(" ")),0);
                f=f.substring(0,f.length()-7);
                f=f.substring(f.lastIndexOf(" ")+1);
            }
            if(!map.containsKey(f))map.put(f,0);
            map.put(f,map.get(f)+l);
        }
        Map<Integer,List<String>>m=new HashMap<>();
        int i=0,arr[]=new int[map.size()];
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            arr[i]=entry.getValue();
            if(!m.containsKey(arr[i]))m.put(arr[i],new ArrayList<>());
            m.get(arr[i]).add(entry.getKey());
            i++;
        }
        Arrays.sort(arr);
        for(int j=arr.length-1;j>=0;j--){
            Collections.sort(m.get(arr[j]));
            System.out.println(m.get(arr[j]).get(0));
            m.get(arr[j]).remove(0);
        }
    }
}