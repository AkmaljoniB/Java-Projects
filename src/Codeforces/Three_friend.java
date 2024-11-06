package Codeforces;

import java.util.*;

public class Three_friend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int[]arr={sc.nextInt(),sc.nextInt(),sc.nextInt()};
            Arrays.sort(arr);
            if(arr[0]!=arr[1])arr[0]++;
            else if (arr[0]!=arr[2]){
                arr[0]++;
                arr[1]++;
            }
            if (arr[1]!=arr[2])arr[2]--;
            else if(arr[2]!=arr[0]){
                arr[2]--;
                arr[1]--;
            }
            System.out.println(arr[2]-arr[1]+arr[1]-arr[0]+arr[2]-arr[0]);
        }
    }
}