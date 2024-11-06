package Codeforces;

import java.util.*;

public class Rearrangement_1701B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Set<Integer> set=new HashSet<>();
            for(int i=1;i<=n;i++)set.add(i);
            System.out.println(2);
            for(int i=1;i<=n;i++){
                int l=i;
                while (set.contains(l)){
                    System.out.print(l+" ");
                    set.remove(l);
                    l*=2;
                }
                if(set.size()==0)break;
            }
            System.out.println();
        }
    }
}