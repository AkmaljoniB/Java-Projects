package If;

import java.util.Scanner;

public class if4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c,k;
        System.out.println("a= ");
        a=scanner.nextInt();
        System.out.println("b= ");
        b=scanner.nextInt();
        System.out.println("c= ");
        c=scanner.nextInt();
        k= 0;
        if (a>0){
            k = (k+1);
        }
        if(b>0){
            k=k+1;
        }
        if(c>0){
            k=k+1;
        }
        System.out.println("musbi= "+k);
    }
}
