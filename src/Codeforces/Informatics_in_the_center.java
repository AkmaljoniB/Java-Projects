package Codeforces;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Informatics_in_the_center {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Integer[]arr=new Integer[n];
            int[]ar=new int[n];
            Map<Integer,Integer> map=new TreeMap<>();
            Map<Integer,Integer> map2=new TreeMap<>();
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                ar[arr[i]]++;
                if (!map.containsKey(arr[i])){
                    map.put(arr[i],i);
                    map2.put(arr[i],i);
                }
                map2.put(arr[i],i);
            }
            int k=2;
            String p="";
            for (int i=0;i<n;i++){
                if (ar[i]==0){
                    if (i==0)p="1 1\n2 "+n;
                    else {
                        int max=0,min=Integer.MAX_VALUE;
                        for (Map.Entry<Integer,Integer>entry:map.entrySet()){
                            if (entry.getKey()<i){
                                max=Math.max(max,entry.getValue());
                                min=Math.min(min,map2.get(entry.getKey()));
                            } else break;
                        }
                        if (max>min)k=-1;
                        else p= "1 "+(max+1)+"\n"+(max+2)+" "+n;
                    }
                    break;
                }else if (ar[i]==1){
                    k=-1;
                    break;
                }
            }
            System.out.println(k==-1?k:k+"\n"+p);
        }
    }
}
