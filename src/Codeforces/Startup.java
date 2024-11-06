package Codeforces;

import java.util.*;

public class Startup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),l=0;
            Map<Integer,Integer> map=new HashMap<>();
            int[]arr=new int[k];
            for(int i=0;i<k;i++){
                int b=sc.nextInt();
                if(!map.containsKey(b))map.put(b,0);
                map.put(b,map.get(b)+sc.nextInt());
            }
            int i=0;
            for(Map.Entry<Integer,Integer>entry:map.entrySet())arr[i++]=entry.getValue();
            Arrays.sort(arr);
            for(i=k-1;i>=0&&i>=k-n;i--)l+=arr[i];
            System.out.println(l);
        }
    }
}