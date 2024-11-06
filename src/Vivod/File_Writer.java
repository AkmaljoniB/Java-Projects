package Vivod;

import java.io.*;

public class File_Writer {
    public static void main(String[] args) {
        FileWriter fr=null;
        String s = "Чамоли гуспанд";
        File file = new File("D:сon.txt");

        try {
            fr = new FileWriter(file, true);
            fr.write(s);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
