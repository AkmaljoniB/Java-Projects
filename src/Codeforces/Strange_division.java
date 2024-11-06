package Codeforces;

import java.util.*;

public class Strange_division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n];
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
              set.add(arr[i]);
            }
            if(set.size()==1) System.out.println("NO");
            else{
                System.out.println("YES");
                StringBuilder sb=new StringBuilder();
                sb.append("B".repeat(Math.max(n-1,0)));
                if(arr[1]==arr[n-1])System.out.println(sb+"R");
                else System.out.println("R"+sb);
            }
        }
    }
}