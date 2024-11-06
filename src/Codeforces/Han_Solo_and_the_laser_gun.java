package Codeforces;

import java.util.*;

public class Han_Solo_and_the_laser_gun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x0=sc.nextInt(),y0=sc.nextInt();
        Set<String>set=new HashSet<>();
        for(int i=0;i<n;i++){
            double x=sc.nextInt(),y=sc.nextInt();
            if(y==y0)set.add("Infinity");
            else if(x==x0)set.add("0.0");
            else set.add((x-x0)/(y-y0)+"");
        }
        System.out.println(set.size());
    }
}