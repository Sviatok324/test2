package ua.ifntung;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Reader {
    public static Stream<String> readStreamFromResources(String fileName) throws IOException {
        return Files.lines(Path.of(fileName));
    }

    public static String[] loadTextFileFromResources(String s) throws IOException {
        return readStreamFromResources(s).toArray(String[]::new);
    }

}