package Codingbat.Logic_1;

public class GreenTicket {
    public int greenTicket(int a, int b, int c) {
        if (a!=b && a!=c && b!=c){
            return 0;
        }
        if (a==b && a==c){
            return 20;
        }
        return 10;
    }
}
