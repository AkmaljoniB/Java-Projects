package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class New_Years_garland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int[]arr = new int[3];
            arr[0]=scanner.nextInt();
            arr[1]=scanner.nextInt();
            arr[2]=scanner.nextInt();
            Arrays.sort(arr);
            if (arr[0]+arr[1]>=arr[2]-1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
