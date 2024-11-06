package Codeforces;

import java.util.Scanner;

public class Escape_of_the_King {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ax=sc.nextInt(),ay=sc.nextInt(),bx=sc.nextInt(),by=sc.nextInt(),cx=sc.nextInt(),cy=sc.nextInt(),l=0;
        if(ax>=bx&&ax>=cx)l++;
        if(ay>=by&&ay>=cy)l++;
        if(ax<bx&&ax<cx)l++;
        if(ay<by&&ay<cy)l++;
        System.out.println(l!=2||Math.abs(cx-ax)==Math.abs(cy-ay)?"No":"Yes");
    }
}