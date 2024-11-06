package Codingbat.Warmup_1;

public class NearHundred {
    public boolean nearHundred(int n) {
        if (n>89 && n<101 || n>189 && n < 201){
            return true;
        }
        return false;
    }
}
