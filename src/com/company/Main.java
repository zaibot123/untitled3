package com.company;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;


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
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.println("type nominator");
                int n = s.nextInt();
                System.out.println("Type denominator");
                int d = s.nextInt();
                int r = n / d;
                System.out.println(r);
            } catch (Exception e) {
                System.out.println(e.toString());

            }

        }


    }
}
