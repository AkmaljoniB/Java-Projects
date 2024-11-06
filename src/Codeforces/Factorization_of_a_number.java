package Codeforces;

import java.math.BigInteger;
import java.util.*;

public class Factorization_of_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,p=2;
            Map<Integer,Integer>map=new HashMap<>();
            while(n!=1){
                if(n%p==0){
                    n/=p;
                    map.put(p,map.getOrDefault(p,0)+1);
                }else{
                    BigInteger a = BigInteger.valueOf(n);
                    if(a.isProbablePrime((int)Math.log(n)))p=n;
                    else while(n%p!=0)p++;
                    if(p%4==0)p++;
                }
            }
            p=0;
            int k=1;
            int[][]arr=new int[map.size()][2];
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                arr[p][0]=entry.getValue();
                arr[p][1]=entry.getKey();
                k*=entry.getKey();
                p++;
            }
            Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
            for(int i=0;i<arr.length;i++){
                if(i!=0)l+=k*(arr[i][0]-arr[i-1][0]);
                else l+=k*arr[i][0];
                k/=arr[i][1];
            }
            System.out.println(l);
        }
    }
}