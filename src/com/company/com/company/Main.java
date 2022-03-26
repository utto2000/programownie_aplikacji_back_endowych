package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args)  {

        File file = new File("test.txt");
        int lenght =  (int) file.length();
        try (
                FileInputStream stream = new FileInputStream(file);
                InputStreamReader reader = new InputStreamReader(stream)
        ) {

            char[] data = new char[lenght];
            int readBytes = reader.read(data,0, lenght);
            if (readBytes != lenght){
                throw  new IOException("File reading error (expected " + lenght + "bytes");
            }
            String text = new String(data);
            System.out.println(text);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
