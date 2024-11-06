package Codingbat.Logic_1;

public class AlarmClock {
    public String alarmClock(int day, boolean vacation) {
        String str = "7:00";
        String str1 = "10:00";
        String str2 = "off";
        if (day>=1 && day<=5 && !vacation){
            return str;
        }
        if (day==0 && !vacation|| day==6 && !vacation){
            return str1;
        }
        if (day>=1 && day<=5 && vacation){
            return str1;
        }
        return str2;
    }
}
