package com.jspider.placement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fdemo22 {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("C:\\Users\\savan\\OneDrive\\Desktop\\Test\\file.txt");
        BufferedReader br = new BufferedReader(f);
        String s = br.readLine();

    }
}
