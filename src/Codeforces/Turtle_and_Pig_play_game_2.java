package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Turtle_and_Pig_play_game_2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            System.out.println(arr[n/2]);
        }
    }
}