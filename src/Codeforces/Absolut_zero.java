package Codeforces;

import java.util.*;

public class Absolut_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),min=Integer.MAX_VALUE,max=0,k=0;
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                min=Math.min(min,arr[i]);
                max=Math.max(max,arr[i]);
            }
            List<Integer>list=new ArrayList<>();
            while(++k<=40){
                if(min==max&&max==0)break;
                int c=(max-min)/2+min;
                if(c==0){
                    k=-1;
                    break;
                }
                list.add(c);
                min=Integer.MAX_VALUE;
                max=0;
                for(int j=0;j<n;j++){
                    arr[j]=Math.abs(arr[j]-c);
                    min=Math.min(min,arr[j]);
                    max=Math.max(max,arr[j]);
                }
            }
            if(k==-1)System.out.println(k);
            else{
                System.out.println(k-1);
                for(Integer integer:list)System.out.print(integer+" ");
                System.out.println();
            }
        }
    }
}
//4 6 8
//2 0 2
//80 40 20 10
//35 5 25 35
//15 15 5 15
//5 5 5 5
//0 0 0 0