package Codeforces;

import java.util.*;

public class Progressive_square{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),min=Integer.MAX_VALUE;
            Map<Integer,Integer>map=new HashMap<>();
            String p="YES";
            for(int i=0;i<n*n;i++){
                int a=sc.nextInt();
                min=Math.min(min,a);
                map.put(a,map.getOrDefault(a,0)+1);
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int a=(min+c*i)+j*d;
                    if(!map.containsKey(a)||map.get(a)==0){
                        p="NO";
                        break;
                    }else map.put(a,map.get(a)-1);
                }
            }
            System.out.println(p);
        }
    }
}