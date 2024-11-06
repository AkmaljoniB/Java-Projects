package Codeforces;

import java.util.*;

public class Sakurako_s_hobbies{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n],num=new int[n];
            boolean[]bool=new boolean[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            String s=sc.next();
            for(int i=0;i<n;i++){
                if(num[i]==0){
                    int l=arr[i]-1,k=0;
                    List<Integer>list=new ArrayList<>();
                    while(!bool[l]){
                        bool[l]=true;
                        if(s.charAt(l)=='0')k++;
                        list.add(l);
                        l=arr[l]-1;
                    }
                    for(Integer integer:list)num[integer]=k;
                }
                System.out.print(num[i]+" ");
            }
            System.out.println();
        }
    }
}