package Codeforces;

import java.util.*;

public class FInd_car{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),q=sc.nextInt();
            long a[]=new long[k+1],b[]=new long[k+1];
            TreeSet<Integer>set=new TreeSet<>();
            Map<Integer,Integer>map=new HashMap<>();
            for(int i=1;i<=k;i++){
                a[i]=sc.nextInt();
                set.add((int)a[i]);
                map.put((int)a[i],i);
            }
            for(int i=1;i<=k;i++)b[i]=sc.nextInt();
            while(q-->0){
                int d=sc.nextInt(),i=map.get(set.ceiling(d));
                System.out.print((int)(b[i-1]+(b[i]-b[i-1])*(d-a[i-1])/(a[i]-a[i-1]))+" ");
            }
            System.out.println();
        }
    }
}