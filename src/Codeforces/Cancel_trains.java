package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cancel_trains{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        for (int t=sc.nextInt();t-->0;){
            int n=sc.nextInt(),m=sc.nextInt(),k=0;
            List<Integer>list=new ArrayList<>();
            while (n-->0)list.add(sc.nextInt());
            while (m-->0)if(list.contains(sc.nextInt()))k++;
            System.out.println(k);
        }
    }
}