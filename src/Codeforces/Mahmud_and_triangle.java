package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Mahmud_and_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) arr[i]=scanner.nextInt();
        Arrays.sort(arr);
        String s = "No";
        for (int i = 0 ; i <n-2;i++){
            if (arr[i]+arr[i+1]>arr[i+2]){
                s ="YES";
                break;
            }
        }
        System.out.println(s);
    }
}
