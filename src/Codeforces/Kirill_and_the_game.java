package Codeforces;

import java.util.Scanner;

public class Kirill_and_the_game{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long l=sc.nextInt(),r=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt(),k=sc.nextInt();
        if((x*k>=l&&x*k<=r)||(l%k==0&&(l/k)>=x&&l/k<=y)||((l/k+1)*k<=r&&(l/k+1)>=x&&l/k+1<=y))System.out.println("YES");
        else System.out.println("No");
    }
}