package Codeforces;

import java.util.*;

public class Numeric_string_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            int m=sc.nextInt();
            for(int i=0;i<m;i++){
                String s=sc.next(),p="YES";
                if(s.length()==n){
                    Map<Character,Integer>map=new HashMap<>();
                    Map<Integer,Character>ma=new HashMap<>();
                    for(int j=0;j<n;j++){
                        if(map.containsKey(s.charAt(j))&&map.get(s.charAt(j))!=arr[j]){
                            p="NO";
                            break;
                        }
                        map.put(s.charAt(j),arr[j]);
                        if(ma.containsKey(arr[j])&&ma.get(arr[j])!=s.charAt(j)){
                            p="NO";
                            break;
                        }
                        ma.put(arr[j],s.charAt(j));
                    }
                }else p="NO";
                System.out.println(p);
            }
        }
    }
}
