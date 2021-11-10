package ua.ifntung;

import java.io.IOException;

public class SplitString {
    //private String line;
    private String path;

    private final String[] arr = Reader.loadTextFileFromResources(path);
    private final FileData[] dataArray = new FileData[arr.length];
    public SplitString() throws IOException {
    }

    public SplitString(String path) throws IOException {
        this.path = path;
    }

    public FileData[] split() throws IOException {
        for (int i = 0; i < arr.length; i++) {
            String[] splitArr = arr[i].split(",");
            int[] numbers = new int[splitArr.length - 2];
            for (int j = 2; j < splitArr.length; j++) {
                String number = splitArr[j];
                numbers[j - 2] = Integer.parseInt(number);
            }
            FileData data = new FileData(splitArr[0], splitArr[1], numbers);
            dataArray[i] = data;
        }
        return dataArray;
    }
    public FileData[] getDataArray() {
        return dataArray;
    }
}
