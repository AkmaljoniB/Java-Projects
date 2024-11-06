package Codingbat.Logic_1;

public class InOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (a < b && b < c && !equalOk) {
            return true;
        }
        if (a==b && b<c && equalOk|| b == c && a<b && equalOk || a==b && b==c && equalOk){
            return true;
        }
            return false;
    }
}
