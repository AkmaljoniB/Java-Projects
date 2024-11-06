package Codeforces;

import java.util.*;
public class Range_Update_Point_Query {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),q=sc.nextInt();
            TreeSet<Integer>set=new TreeSet<>();
            StringBuilder sb=new StringBuilder();
            String[]arr=new String[n];
            for(int i=0;i<n;i++){
                set.add(i);
                arr[i]=sc.next();
            }
            while (q-->0){
                int a=sc.nextInt();
                if(a==1){
                    int l=sc.nextInt()-1,r=sc.nextInt()-1;
                    Integer p=set.ceiling(l);
                    if(p==null)continue;
                    else l=p;
                    p=set.floor(r);
                    if(p==null)continue;
                    else r=p;
                    for (int i=l;i<=r;i++){
                        int s=0;
                        for (int j=0;j<arr[i].length();j++)s+=arr[i].charAt(j)-'0';
                        arr[i]=s+"";
                        if (arr[i].length()<2)set.remove(i);
                    }
                }else sb.append(arr[sc.nextInt()-1]+"\n");
            }
            System.out.println(sb);
        }
    }
}