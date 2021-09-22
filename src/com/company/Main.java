package com.company;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;


public class Main {

    public static void main(String[] args) {
        File file = new File("MyFile.txt");

        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("nå");

        } catch (Exception d) {
            System.out.println(d.getMessage());
        } finally {
            System.out.println("finished try/catch");
        }
        file.getName();


    }
}
