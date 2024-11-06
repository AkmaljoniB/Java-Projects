package Codeforces;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Changing_the_sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
            int n =sc.nextInt();
            Map<Integer,Integer> map=new HashMap<>();
            int[]arr=new int[n+2];
            for (int i=1;i<=n;i++)arr[i]=sc.nextInt();
            arr[0]=arr[1];
            arr[n+1]=arr[n];
            for (int i=1;i<=n;i++){
                if (!map.containsKey(arr[i])){
                    if (arr[i-1]!=arr[i])map.put(arr[i],1);
                    else map.put(arr[i],0);
                }
                if (arr[i+1]!=arr[i])map.put(arr[i],map.get(arr[i])+1);
            }
            System.out.println(Collections.min(map.values()));
        }
    }
}