package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class David_and_bags_of_candy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
        Arrays.sort(arr);
        System.out.println(arr[3]+arr[0]==arr[1]+arr[2]||arr[3]==arr[0]+arr[1]+arr[2]?"YES":"NO");
    }
}