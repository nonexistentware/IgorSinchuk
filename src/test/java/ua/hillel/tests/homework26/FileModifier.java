package ua.hillel.tests.homework26;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileModifier {
    public void changeFile() throws IOException {
        String text = "This file was changed";
        File[] filesInFolder = new File("target/downloads").listFiles();
        FileWriter writer = new FileWriter(filesInFolder[0]);
        writer.write(text);
        writer.close();
    }
}