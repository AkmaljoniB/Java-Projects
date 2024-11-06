package Codingbat.Logic_1;

public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday){
            if (speed-5<=60){
                return 0;
            }
            if (speed-5<=80){
                return 1;
            }
            return 2;
        }
        if (speed<=60){
            return 0;
        }
        if (speed<=80){
            return 1;
        }
        return 2;
    }
}
