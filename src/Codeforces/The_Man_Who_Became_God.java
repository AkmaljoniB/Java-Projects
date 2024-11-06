package Codeforces;

import java.util.*;

public class The_Man_Who_Became_God {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),a=sc.nextInt(),s=0;
            List<Integer> list=new ArrayList<>();
            for (int i=1;i<n;i++) {
                int b=sc.nextInt();
                list.add(Math.abs(b-a));
                s+=Math.abs(b-a);
                a=b;
            }
            Collections.sort(list);
            for (int i=list.size()-1;i>=list.size()-k+1; i--) s-=list.get(i);
            System.out.println(s);
        }
    }
}
