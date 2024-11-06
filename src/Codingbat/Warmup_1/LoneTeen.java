package Codingbat.Warmup_1;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        if (a > 12 && a < 20 && b<=12 ||a > 12 && a < 20 && b>=20 || a <= 12 && b>12 && b<20|| a >= 20 && b>12 && b<20){
            return true;
        }
        return false;
    }
}
