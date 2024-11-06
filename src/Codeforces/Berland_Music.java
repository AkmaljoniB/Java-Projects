package Codeforces;

import java.util.*;

public class Berland_Music {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            for (int i=0;i<n;i++)arr[i]=sc.nextInt();
            String s=sc.next();
            int l=s.replace("1","").length();
            Queue<Integer>pq1=new PriorityQueue<>(),pq0=new PriorityQueue<>();
            for (int i=0;i<n;i++) {
                if (s.charAt(i) == '0') {if (arr[i] > l) pq1.add(arr[i]);
                }else if (arr[i]<=l)pq0.add(arr[i]);
            }
            for (int i=0;i<n;i++){
                String p=arr[i]+" ";
                if (s.charAt(i)=='0') {if (arr[i] > l) p = pq0.poll() + " ";
                }else if (arr[i]<=l) p=pq1.poll()+" ";
                System.out.print(p);
            }
            System.out.println();
        }
    }
}