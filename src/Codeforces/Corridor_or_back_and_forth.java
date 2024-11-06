package Codeforces;

import java.util.Scanner;

public class Corridor_or_back_and_forth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int min = Integer.MAX_VALUE;
            for (int i = 0 ; i <n;i++){
                int d = scanner.nextInt();
                int s = scanner.nextInt();
                min = Math.min(min,d+((s-1)/2));
            }
            System.out.println(min);
        }
    }
}
