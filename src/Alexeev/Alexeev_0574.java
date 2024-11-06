package Alexeev;

import java.util.*;
public class Alexeev_0574{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String[]s1=s.next().split(""),s2=s.next().split("");
        Arrays.sort(s1);Arrays.sort(s2);
        System.out.println(Arrays.equals(s1,s2)?"YES":"NO");
    }
}