package Codeforces;

import java.util.*;

public class tree_amount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s="NO";
            List<Integer> list=new ArrayList<>();
            Map<Integer,Integer> map=new HashMap<>();
            for (int i=0;i<n;i++){
                int a=sc.nextInt()%10;
                if (!map.containsKey(a)){
                    map.put(a,1);
                    list.add(a);
                } else if (map.get(a)<3){
                    map.put(a,map.get(a)+1);
                    list.add(a);
                }
            }
            out:for (int i=0;i<list.size();i++){
                for (int j=i+1;j<list.size();j++){
                    for (int p=j+1;p<list.size();p++){
                        if ((list.get(i)+list.get(j)+list.get(p))%10==3){
                            s="YES";
                            break out;
                        }
                    }
                }
            }
            System.out.println(s);
        }
    }
}