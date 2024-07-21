package com.jspider.placement.smallprojectbasedoncollection;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) throws IOException {

        write();
        copyWrite();

    }

    public static void copyWrite() throws IOException {

        FileWriter fileWriter = new FileWriter("C:\\Users\\savan\\OneDrive\\Desktop\\filehandling\\second1.txt");
        FileReader fileReader = new FileReader("C:\\Users\\savan\\OneDrive\\Desktop\\filehandling\\first.txt");
        int n = fileReader.read();
        String s = "";
        System.out.println("welcome"+n);
        while (n!=-1)
        {
         s+=(char)n;
         n=fileReader.read();
        }
        System.out.println(s);
        fileWriter.write(s);
        System.out.println("done");
    }


    public static  void write() throws IOException {
        File file = new File("C:\\Users\\savan\\OneDrive\\Desktop\\filehandling\\first.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("file handling concept here");
        fileWriter.close();
    }
}
