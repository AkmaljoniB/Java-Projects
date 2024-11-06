package Codeforces;

import java.util.*;

public class Two_letter_strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Map<Character,Map<String,Long>>map1=new HashMap<>();
            Map<Character,Map<String,Long>>map2=new HashMap<>();
            for(int i=0;i<n;i++){
                String s=sc.next();
                if(!map1.containsKey(s.charAt(0)))map1.put(s.charAt(0),new HashMap<>());
                if(!map2.containsKey(s.charAt(1)))map2.put(s.charAt(1),new HashMap<>());
                map1.get(s.charAt(0)).put(s,map1.get(s.charAt(0)).getOrDefault(s,0L)+1);
                map2.get(s.charAt(1)).put(s,map2.get(s.charAt(1)).getOrDefault(s,0L)+1);
            }
            long s=0;
            for(Map.Entry<Character,Map<String,Long>>entry:map1.entrySet()){
                long l=0,p=0;
                if (entry.getValue().size()>1) {
                    for (Map.Entry<String,Long> entry1 : entry.getValue().entrySet()) {
                        if (l==0)l=entry1.getValue();
                        else {
                            p+=l*entry1.getValue();
                            l+=entry1.getValue();
                        }
                    }
                }
                s+=p;
            }
            for(Map.Entry<Character,Map<String,Long>>entry:map2.entrySet()){
                long l=0,p=0;
                if (entry.getValue().size()>1) {
                    for (Map.Entry<String,Long> entry1 : entry.getValue().entrySet()) {
                        if (l==0)l=entry1.getValue();
                        else {
                            p+=l*entry1.getValue();
                            l+=entry1.getValue();
                        }
                    }
                }
                s+=p;
            }
            System.out.println(s);
        }
    }
}