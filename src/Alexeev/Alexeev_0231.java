package Alexeev;

import java.util.Scanner;

public class Alexeev_0231 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.next();
        String p="";
        int k =0;
        for (int i =0;i<s.length();i++){
            String f =s.substring(i,i+1);
            if (f.hashCode()>=48&&f.hashCode()<=57)p+=f;
            else {
                if (p.equals(""))p="1";
                for (int j = 0; j < Integer.parseInt(p); j++) {
                    System.out.print(f);
                    k++;
                    if (k%40==0) System.out.println();
                }
                p="";

            }
        }
    }
}
