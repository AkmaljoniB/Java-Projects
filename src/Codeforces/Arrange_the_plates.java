package Codeforces;

import java.util.Scanner;

public class Arrange_the_plates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int h=sc.nextInt(),w=sc.nextInt();
            for (int i=0;i<h;i++) {
                for (int j=0;j<w;j++) {
                    if ((i==0||i==h-1)&&j%2==0) System.out.print(1);
                    else {
                        if (i!=0 && i!=h-1 &&i%2==0 && i!=h-2&&(j==0||j==w-1)) System.out.print(1);
                        else System.out.print(0);
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}