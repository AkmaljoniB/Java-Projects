package Codeforces;

import java.util.*;

public class Some_advantages {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int[]arr={sc.nextInt(),sc.nextInt(),sc.nextInt()};
            for(int i=0;i<5;i++){
                Arrays.sort(arr);
                arr[0]++;
            }
            System.out.println(arr[0]*arr[1]*arr[2]);
        }
    }
}