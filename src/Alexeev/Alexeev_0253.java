package Alexeev;

import java.util.Scanner;

public class Alexeev_0253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt(), m1 = sc.nextInt(), h2 = sc.nextInt(), m2 = sc.nextInt(), k = 0;
        if(h1>h2 || (h1==h2 &&m1>m2))h2+=24;
        while (true){
            if (m1<30 && (h1<h2|| (m1<m2&&m2>30))){
                k++;
                m1=30;
            } else if (h1+1<=h2){
                h1++;
                m1=0;
                if (h1%12==0)k+=12;
                else k+=h1%12;
            } else break;
        }
        System.out.println(k);
    }
}