package Codingbat.Logic_1;

public class BlueTicket {
    public static void main(String[] args) {
        System.out.println(blueTicket(8,4,1));
    }
    public static int blueTicket(int a, int b, int c) {
        int ab = a+b;
        int ac = a+c;
        int bc = b+c;
        if (ab==10 || bc==10 || ac==10){
            return 10;
        }
        if (ab-10>=bc||ab-10>=ac){
            return 5;
        }
        return 0;
    }
}
