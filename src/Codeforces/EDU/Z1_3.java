package Codeforces.EDU;

import java.util.*;

public class Z1_3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            String t=sc.next(),p=sc.next();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<=t.length()-p.length();i++){
                list.add(i);
                for(int j=i;j<i+p.length();j++){
                    if(t.charAt(j)!=p.charAt(j-i)&&p.charAt(j-i)!='?'){
                        list.remove((Object)i);
                        break;
                    }
                }
            }
            System.out.println(list.size());
            for(Integer integer:list)System.out.print(integer+" ");
            System.out.println();
        }
    }
}