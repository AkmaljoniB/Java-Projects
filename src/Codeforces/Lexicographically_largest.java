package Codeforces;

import java.util.*;

public class Lexicographically_largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),p=0;
            long[]arr=new long[n];
            List<Long>list=new ArrayList<>();
            for (int i=0;i<n;i++)arr[i]=sc.nextInt();
            for (int i=0;i<n;i++){
                if (list.contains(arr[i]+i+1-p)){
                    p++;
                    list.add(arr[i]+i+1-p);
                }else list.add(arr[i]+i+1-p);
            }
            Collections.sort(list);
            for (int i=n-1;i>=0;i--) System.out.print(list.get(i)+" ");
            System.out.println();
        }
    }
}