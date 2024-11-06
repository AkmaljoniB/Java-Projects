package Alexeev;

import java.util.Scanner;

public class Alexeev_0550 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
//        System.out.println(simpleDateFormat.format(date));
        int a = scanner.nextInt();
        if ((a % 100 != 0 && a % 4 == 0) || a % 400 == 0) {
            if (a<10){
                System.out.println("12/09/000"+a);
            } else if (a < 100){
                System.out.println("12/09/00"+a);
            } else if (a<1000){
                System.out.println("12/09/0"+a);
            } else {
                System.out.println("12/09/"+a);
            }
        } else {
            if (a<10){
                System.out.println("13/09/000"+a);
            } else if (a<100){
                System.out.println("13/09/00"+a);
            } else if (a<1000){
                System.out.println("13/09/0"+a);
            } else {
                System.out.println("13/09/"+a);
            }
        }
    }
}