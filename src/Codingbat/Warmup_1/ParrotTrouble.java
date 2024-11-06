package Codingbat.Warmup_1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour > 0 && hour <=23) {
            if (talking && hour<7 || hour>20){
                return true;
            }
            if (!talking && hour>6){
                return false;
            }
            if (talking && hour == 21 || hour == 23){
                return true;
            }
        }
        return false;
    }
}
