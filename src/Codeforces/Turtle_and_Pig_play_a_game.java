package Codeforces;

import java.util.Scanner;

public class Turtle_and_Pig_play_a_game{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int l=sc.nextInt(),r=sc.nextInt(),k=0;
            while(r>1){
                r/=2;
                k++;
            }
            System.out.println(k);
        }
    }
}