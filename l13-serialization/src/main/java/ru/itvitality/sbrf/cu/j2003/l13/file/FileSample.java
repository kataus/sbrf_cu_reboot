package ru.itvitality.sbrf.cu.j2003.l13.file;

import java.io.File;

public class FileSample {
    public static void main(String[] args){
        File file = new File("l13-serialization/src/main");

        System.out.println(file.exists());

    }
}
