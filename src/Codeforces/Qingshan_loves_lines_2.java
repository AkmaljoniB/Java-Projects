package Codeforces;

import java.util.*;

public class Qingshan_loves_lines_2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int l=s.replace("0","").length();
            if(l!=n-l)System.out.println(-1);
            else{
                int k=0;
                List<Integer>list=new ArrayList<>();
                for(int i=0;i<s.length()/2;i++){
                    if(s.charAt(i)==s.charAt(s.length()-1-i)){
                        k++;
                        if(s.charAt(i)=='1'){
                            list.add(i);
                            s=s.substring(0,i)+"01"+s.substring(i);
                        }else{
                            list.add(s.length()-i);
                            s=s.substring(0,s.length()-i)+"01"+s.substring(s.length()-i);
                        }
                    }
                }
                System.out.println(k);
                for(Integer integer:list)System.out.print(integer+" ");
                System.out.println();
            }
        }
    }
}