package Codingbat.Logic_1;

public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp>=60 && temp<=90 && isSummer){
            return true;
        }
        if (temp>=60 && temp<=100 && !isSummer){
            return true;
        }
        return false;
    }
}
