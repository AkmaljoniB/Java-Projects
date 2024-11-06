package Codeforces;

import java.util.*;

public class Couples{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        List<Integer>[]arr=new List[4];
        for(int i=0;i<4;i++)arr[i]=new ArrayList<>();
        for(int i=0;i<m;i++){
            int a=sc.nextInt(),b=sc.nextInt();
            if(arr[0].size()<3&&!arr[0].contains(a)&&!arr[0].contains(b))arr[0].add(a);
            if(arr[1].size()<3&&!arr[1].contains(a)&&!arr[1].contains(b)){
                if(arr[1].size()==0)arr[1].add(a);
                else arr[1].add(b);
            }
            if(arr[2].size()<3&&!arr[2].contains(a)&&!arr[2].contains(b)){
                if(arr[2].size()==0)arr[2].add(b);
                else arr[2].add(a);
            }
            if(arr[3].size()<3&&!arr[3].contains(a)&&!arr[3].contains(b))arr[3].add(b);
        }
        for(int i=0;i<4;i++)n=Math.min(n,arr[i].size());
        System.out.println(n<3?"YES":"NO");
    }
}