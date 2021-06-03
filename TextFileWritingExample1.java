package com.company.character_file;

import java.io.*;


public class TextFileWritingExample1 {

    public static void main(String[] args) {
//        try {
//            FileWriter writer = new FileWriter("MyFile.txt");
//            writer.write("Xin chào");
//            writer.write("\r\n");   // write new line
//            writer.write("Good Bye!");
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

// đọc ghi file
//        try {
//            FileWriter outputStream = new FileWriter("MyFile.txt",true);
//            BufferedWriter bufferedWriter = new BufferedWriter(outputStream);
//            bufferedWriter.write("Xin chào");
//            bufferedWriter.newLine();
//            bufferedWriter.write("Hẹn gặp lại!");
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileWriter outputStream = new FileWriter("MyFile.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStream);
            bufferedWriter.write(new Product("Iphone",1000000,"Iphone của tôi, tôi rất thích nó").toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
