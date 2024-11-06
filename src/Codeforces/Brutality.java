package Codeforces;

import java.util.*;

public class Brutality{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        String s=sc.next();
        long res=0;
        List<Integer>l=new ArrayList<>();
        l.add(arr[0]);
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1))l.add(arr[i]);
            else{
                Collections.sort(l);
                for(int j=l.size()-1;j>=Math.max(l.size()-k,0);j--)res+=l.get(j);
                l=new ArrayList<>();
                l.add(arr[i]);
            }
        }
        Collections.sort(l);
        for(int j=l.size()-1;j>=Math.max(l.size()-k,0);j--)res+=l.get(j);
        System.out.println(res);
    }
}