package Codingbat.Logic_1;

public class RedTicket {
    public int redTicket(int a, int b, int c) {
        if (a==2 && b==2 && c==2){
            return 10;
        }
        if (a==b && a==c){
            return 5;
        }
        if(b==0 && c>a){
            return 1;
        }
        if(b>a && c==0){
            return 1;
        }
        if (b>a && c>a||b==c){
            return 1;
        }
        return 0;
    }
}
