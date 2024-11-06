package Codeforces;

import java.util.*;

public class News_about_competition{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[n],s=0;
        for(int i=0;i<n;i++)s+=a[i]=sc.nextInt();
        if(s>=n-1&&a[0]!=0){
            System.out.println(n-1);
            List<Integer>list=new ArrayList<>();
            StringBuilder sb=new StringBuilder();
            int c=0,p=a[c];
            for(int i=1;i<n;i++){
                while(p==0){
                    c++;
                    p=a[c];
                }
                if(a[i]!=0){
                    p--;
                    sb.append((c+1)+" "+(i+1)+"\n");
                }else list.add(i);
            }
            for(Integer integer:list){
                while(p==0){
                    c++;
                    p=a[c];
                }
                sb.append((c+1)+" "+(integer+1)+"\n");
                p--;
            }
            System.out.println(sb);
        }else System.out.println(-1);
    }
}