package Codeforces;

import java.util.Scanner;

public class Magic_wand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt(),y=sc.nextInt();
            System.out.println(x>3||(x>1 &&y<4)||y<2?"YES":"NO");
        }
    }
}
