package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Table_decoration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[]arr={sc.nextInt(),sc.nextInt(),sc.nextInt()};
        Arrays.sort(arr);
        System.out.println((arr[0]+arr[1]+Math.min(arr[2],(arr[1]+arr[0])*2))/3);
    }
}
