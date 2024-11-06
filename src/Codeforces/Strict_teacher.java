package Codeforces;

import java.util.*;

public class Strict_teacher{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),q=sc.nextInt();
            TreeSet<Integer>set=new TreeSet<>();
            for(int i=0;i<m;i++)set.add(sc.nextInt());
            while(q-->0){
                int a=sc.nextInt(),max;
                Integer l=set.floor(a),r=set.ceiling(a);
                if(r!=null&&l!=null)max=(r-l)/2;
                else{
                    if(r==null)max=n-l;
                    else max=r-1;
                }
                System.out.println(max);
            }
        }
    }
}