package ua.ifntung;

import java.io.IOException;

public class SearchMax extends Operation{
    private int maxPositiveValue;
    private int maxNegativeValue;

    @Override
    public void searchNumbers(int i) throws IOException {
        FileData fileData = new FileData();
        SplitString splitString = new SplitString();
        splitString.split();
        Writer writer = new Writer();
        if (splitString.getDataArray()[i].getCommandMaxMin().equals("Max")) {
            if (splitString.getDataArray()[i].getCommandPosNeg().equals("pos")) {
                maxPositiveValue = splitString.getDataArray()[i].getValues()[0];
                for (int j = 1; j < splitString.getDataArray()[i].getValues().length; j++) {
                    if ((splitString.getDataArray()[i].getValues()[j] > maxPositiveValue) && (splitString.getDataArray()[i].getValues()[j] > 0)) {
                        maxPositiveValue = splitString.getDataArray()[i].getValues()[j];
                    }
                }

                System.out.println("Max positive number: " + maxPositiveValue);
                writer.whenWriteStringUsingBufferedWritter_thenCorrect(maxPositiveValue, "max", "pos");
            } else if (splitString.getDataArray()[i].getCommandPosNeg().equals("neg")) {
                maxNegativeValue = splitString.getDataArray()[i].getValues()[0];
                for (int j = 1; j < splitString.getDataArray()[i].getValues().length; j++) {
                    if ((splitString.getDataArray()[i].getValues()[j] < maxNegativeValue) && (splitString.getDataArray()[i].getValues()[j] < 0)) {
                        maxNegativeValue = splitString.getDataArray()[i].getValues()[j];
                    }
                }
                System.out.println("Max negative number: " + maxNegativeValue);
                writer.whenWriteStringUsingBufferedWritter_thenCorrect(maxNegativeValue, "max", "neg");
            } else {
                throw new IllegalArgumentException("Invalid command name!");
            }

        }
    }

    public int getMaxPositiveValue() {
        return maxPositiveValue;
    }

    public int getMaxNegativeValue() {
        return maxNegativeValue;
    }
}
