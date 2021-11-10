package ua.ifntung;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void whenWriteStringUsingBufferedWritter_thenCorrect(int number, String minMax, String negPos) {
        File myFile = new File("output.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true));
            SplitString splitString = new SplitString();
            if (minMax.equals("min")) {
                if (negPos.equals("neg")) {
                    String s = String.valueOf(number);
                    writer.write("Minimal negative number is: " + s);
                    writer.newLine();
                } else if (negPos.equals("pos")) {
                    String s = String.valueOf(number);
                    writer.write("Minimal positive numbers is: " + s);
                    writer.newLine();
                }
            } else if (minMax.equals("max")) {
                if (negPos.equals("neg")) {
                    String s = String.valueOf(number);
                    writer.write("Maximal negative number is: " + s);
                    writer.newLine();
                } else if (negPos.equals("pos")) {
                    String s = String.valueOf(number);
                    writer.write("Maximal positive number is: " + s);
                    writer.newLine();
                }
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
