package com.Angus.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) {
        File jkDir = new File("C:\\jk");
        jkDir.mkdir();
        try {
            FileWriter fw = new FileWriter("C:\\jk\\output.txt");
            fw.write("abcskkk");
            fw.write("\n");
            fw.write("sjkkjskjs");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
