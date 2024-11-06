package Codeforces;

import java.util.*;

public class Maximum_plus_quantity{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),max=0,l=0;
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(max<a){
                    max=a;
                    list=new ArrayList<>();
                    list.add(i);
                }else if(max==a)list.add(i);
            }
            if(n%2!=0){
                for(Integer integer:list) {
                    if(integer%2==0) {
                        l++;
                        break;
                    }
                }
            }
            System.out.println(max+n/2+l);
        }
    }
}