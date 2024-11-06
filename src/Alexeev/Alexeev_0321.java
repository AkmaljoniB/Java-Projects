package Alexeev;

import java.util.*;

public class Alexeev_0321{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<37;i++){
            String p=Integer.toString(n,i)+"";
            Set<String>set=new HashSet<>();
            for(int j=0;j<p.length();j++)set.add(p.charAt(j)+"");
            System.out.print(set.size()==p.length()?i+" ":"");
        }
    }
}