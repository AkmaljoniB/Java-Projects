package Codeforces;

import java.util.Scanner;

public class Deadly_Laser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),sx=sc.nextInt(),sy=sc.nextInt(),d=sc.nextInt();
            if ((sy-d<=1||sx+d>=n)&&(sx-d<=1 ||sy+d>=m)) System.out.println(-1);
            else System.out.println(n+m-2);
        }
    }
}
//2 4 1 3 1
//2 4 2 2 1