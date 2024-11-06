package Codeforces;

import java.util.Scanner;

public class Valera_and_X {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        String[]ars =new String[n];
        ars[0]=sc.next();
        String f =ars[0].substring(0,1),d =ars[0].substring(1,2),s="YES";
        if (ars[0].indexOf(f)!=n-ars[0].lastIndexOf(f)-1||ars[0].replace(f,"").replace(d,"").length()!=0||(ars[0].replace(d,"").length()!=2 && ars[0].replace(d,"").length()!=1))s="NO";
        for (int i =1;i<n;i++){
            ars[i]=sc.next();
            if (ars[i].indexOf(f)!=n-ars[i].lastIndexOf(f)-1||ars[i].replace(f,"").replace(d,"").length()!=0||(ars[i].replace(d,"").length()!=2 && ars[i].replace(d,"").length()!=1)){
                s="NO";
                break;
            }
        }
        System.out.println(s);
    }
}
