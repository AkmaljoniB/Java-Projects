package Codingbat.Logic_1;

public class InOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk && c>b){
            return true;
        }
        if (b>a && c>b && !bOk){
            return true;
        }
        return false;
    }
}
