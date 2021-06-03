package com.company.character_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This program demonstrates how to read characters from a text file.
 * @author www.codejava.net
 *
 */
public class TextFileReadingExample1 {

    public static void main(String[] args) {
//        try {
//            FileReader reader = new FileReader("MyFile.txt");
//            int character;
//
//            while ((character = reader.read()) != -1) {
//                System.out.print((char) character);
//            }
//            reader.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //cách 2
//        try {
//            FileReader reader = new FileReader("MyFile.txt");
//            BufferedReader bufferedReader = new BufferedReader(reader);
//
//            String line;
//
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//            reader.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileReader reader = new FileReader("MyFile.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                Product product = new Product(strings[0], Integer.parseInt(strings[1]), strings[2]);
                System.out.println(product);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}