package Codingbat.Logic_1;

public class Less20 {
    public boolean less20(int n) {
        if ((n+3)%20==1||(n+3)%20==2){
            return true;
        }
        return false;
    }
}
