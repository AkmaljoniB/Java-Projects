package Codeforces;

import java.util.*;

public class Os_X{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int[]arr={sc.nextInt(),sc.nextInt(),sc.nextInt()};
            Arrays.sort(arr);
            System.out.println(arr[2]-arr[1]+arr[1]-arr[0]);
        }
    }
}