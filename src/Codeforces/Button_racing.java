package Codeforces;

import java.util.Scanner;

public class Button_racing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt(),v1=sc.nextInt()*s,v2=sc.nextInt()*s;
        v1+=sc.nextInt()*2;
        v2+=sc.nextInt()*2;
        System.out.print(v1==v2?"Friendship":v1<v2?"First":"Second");
    }
}