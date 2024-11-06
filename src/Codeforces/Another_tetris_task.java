package Codeforces;

import java.util.Scanner;

public class Another_tetris_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int max =0;
            int j=0,to=0;
            for (int i = 0; i < n; i++) {
                int a =scanner.nextInt();
                max=Math.max(max,a);
                if (a%2==0)j++;
                else to++;
            }
            if ((max%2==0 && to==0) || (max%2!=0 && j==0)) System.out.println("YES");
            else System.out.println("No");
        }
    }
}
