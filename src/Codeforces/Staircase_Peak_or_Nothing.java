package Codeforces;

import java.util.*;

public class Staircase_Peak_or_Nothing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            System.out.println(a<b&&b<c?"STAIR":b>a&&b>c?"PEAK":"NONE");
        }
    }
}