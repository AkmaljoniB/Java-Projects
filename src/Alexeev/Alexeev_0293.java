package Alexeev;

import java.util.Scanner;

public class Alexeev_0293 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]arr = new int[n];
        int[]ar1 = new int[n];
        double p =0;
        int l=0;
        for (int i =0;i<arr.length;i++)arr[i] = scanner.nextInt();
        for (int i =0;i<ar1.length;i++){
            ar1[i] = scanner.nextInt();
            if ((arr[i]*ar1[i])>p){
                p = arr[i]*ar1[i];
                l=i;
            }
        }
        System.out.println(l+1);
    }
}
