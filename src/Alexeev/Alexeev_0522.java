package Alexeev;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Alexeev_0522 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt(),m=sc.nextInt();
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for (int i = 0; i < n; i++) set1.add(sc.nextInt());
        for (int i = 0; i < m; i++) set2.add(sc.nextInt());
        System.out.println(set1.equals(set2)?1:0);
    }
}
