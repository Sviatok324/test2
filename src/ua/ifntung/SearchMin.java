package ua.ifntung;

import java.io.IOException;

public class SearchMin extends Operation{
    private int minPositiveValue;
    private int minNegativeValue;

    @Override
    public void searchNumbers(int i) throws IOException {
        SplitString splitString = new SplitString();
        splitString.split();
        Writer writer = new Writer();
        if (splitString.getDataArray()[i].getCommandMaxMin().equals("Min")) {
            if (splitString.getDataArray()[i].getCommandPosNeg().equals("pos")) {
                minPositiveValue = splitString.getDataArray()[i].getValues()[0];
                for (int j = 1; j < splitString.getDataArray()[i].getValues().length; j++) {
                    if ((splitString.getDataArray()[i].getValues()[j] < minPositiveValue) && (splitString.getDataArray()[i].getValues()[j] > 0)) {
                        minPositiveValue = splitString.getDataArray()[i].getValues()[j];
                    }
                }
                System.out.println("Min positive number: " + minPositiveValue);
                writer.whenWriteStringUsingBufferedWritter_thenCorrect(minPositiveValue, "min", "pos");
            } else if (splitString.getDataArray()[i].getCommandPosNeg().equals("neg")) {
                minNegativeValue = splitString.getDataArray()[i].getValues()[0];
                for (int j = 1; j < splitString.getDataArray()[i].getValues().length; j++) {
                    if ((splitString.getDataArray()[i].getValues()[j] < minNegativeValue) && (splitString.getDataArray()[i].getValues()[j] < 0)) {
                        minNegativeValue = splitString.getDataArray()[i].getValues()[j];
                    }
                }

                System.out.println("Min negative number: " + minNegativeValue);
                writer.whenWriteStringUsingBufferedWritter_thenCorrect(minNegativeValue, "min", "neg");

            } else {
                throw new IllegalArgumentException("Invalid command name!");
            }

        }
    }

    public int getMinPositiveValue() {
        return minPositiveValue;
    }

    public int getMinNegativeValue() {
        return minNegativeValue;
    }
}
