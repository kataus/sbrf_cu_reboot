package ru.itvitality.sbrf.cu.j2003.l15.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        new FilesExample().go();
    }

    private void go() throws IOException {
        Path path = Paths.get("l15-nio/src/main/resources/share.xml");
        boolean pathExists = Files.exists(path);
        System.out.println("pathExists:" + pathExists);
        Path pathNE = Paths.get("l15-nio/src/main/resources/NE.xml");
        boolean pathNotExists = Files.exists(pathNE);
        System.out.println(pathNotExists);

        Files.createDirectory(Paths.get("l15-nio/tmp"));

        Path source = Paths.get("l15-nio/src/main/resources/share.xml");
        Path destination = Paths.get("l15-nio/tmp/share.xml");

        Files.copy(source, destination);


        long size = Files.size(path);
        System.out.println("file size: " + size);


        System.out.println("contentAll:");

        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        }

        System.out.println("filtered:");

        try (Stream<String> stream = Files.lines(path)) {
            stream.filter(line -> line.contains("share"))
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
        }

        String testString = "Test-Test-Data-String";
        Files.write(Paths.get("l15-nio/tmp/newFile.txt"), testString.getBytes());
    }
}
