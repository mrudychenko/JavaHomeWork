package com.pb.rudychenko.hw9;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {

    public static void main(String[] args) throws IOException {
        //createNumbersFile();  //make file numbers.txt
        createOddNumbersFile();//make file odd-numbers.txt
        }


    public static void createNumbersFile(){

        int[] array = new int[100];
        final Random random = new Random();
        for (int i = 0; i < array.length; ++i)
            array[i] = random.nextInt(100);

        try (final FileWriter writer = new FileWriter("numbers1.txt", false))
        {
            for (int i = 0; i < array.length; i++)
            {
                if (i % 10==0){writer.write(System.lineSeparator());}//тут не правильно работает

                String s = Integer.toString(array[i]);
                //s.split("-?\\d+",10);
                //s.replaceAll(".{10}", "$0\n");
                //writer.write(s+" ");
                writer.write(s+" ");

                System.out.print(s);
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void createOddNumbersFile() throws IOException {
        Scanner input = new Scanner(new File("numbers1.txt"));
        FileWriter fileWriter = new FileWriter("odd-numbers.txt");

        while (input.hasNextLine()) {
            Scanner scan = new Scanner(input.nextLine());

            while (scan.hasNextInt()) {
                int i = scan.nextInt();
                if (i % 2 == 0) {
                    System.out.format("/0\\ ", i);// в консоль печатает потому шо  int
                    fileWriter.write( i+" ");
                    i = 0;
                } else
                    System.out.print(i + " ");
                fileWriter.write(i + " ");     //а в файл нет
                //ЖДУ ВАШЕ РЕШЕНИЕ ЗАДАЧИ
            }
            scan.close();
            //fileWriter.write(System.lineSeparator());


            System.out.println();
    }
        }
}
