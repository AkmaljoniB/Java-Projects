package Codeforces;

import java.util.*;

public class Badge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n+1];
        for(int i=1;i<=n;i++)arr[i]=sc.nextInt();
        for(int i=1;i<=n;i++){
            int l=i;
            Set<Integer>set=new HashSet<>();
            set.add(i);
            while(!set.contains(arr[l])){
                set.add(arr[l]);
                l=arr[l];
            }
            System.out.println(arr[l]);
        }
    }
}