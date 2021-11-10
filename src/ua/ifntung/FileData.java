package ua.ifntung;

import java.io.IOException;

public class FileData {
    private String commandMaxMin;
    private String commandPosNeg;
    private int[] values;
    public FileData() throws IOException {
    }

    public FileData(String commandMaxMin, String commandPosNeg, int[] values) throws IOException {
        super();
        this.commandMaxMin = commandMaxMin;
        this.commandPosNeg = commandPosNeg;
        this.values = values;
    }

    public String getCommandMaxMin() {
        return commandMaxMin;
    }

    public String getCommandPosNeg() {
        return commandPosNeg;
    }

    public int[] getValues() {
        return values;
    }
}
