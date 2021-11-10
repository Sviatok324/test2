package ua.ifntung;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter file name: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        SplitString splitString = new SplitString(path);
        splitString.split();
        SearchMin searchMin = new SearchMin();
        SearchMax searchMax = new SearchMax();
        for (int i = 0; i < splitString.getDataArray().length; i++) {
            if (splitString.getDataArray()[i].getCommandMaxMin().equals("Min")) {
                searchMin.searchNumbers(i);

            } else if (splitString.getDataArray()[i].getCommandMaxMin().equals("Max")) {
                searchMax.searchNumbers(i);
            }
        }    }
}
