package Main5;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) {
        String host = "C:\\Users\\ihsan\\OneDrive\\Masaüstü\\öğrenci bilgileri.txt";
        String target = "C:\\Users\\ihsan\\OneDrive\\Masaüstü\\öğrenci harfnotları.txt";

        String data = "";

        try (Scanner scn = new Scanner(new BufferedReader(new FileReader(host))); BufferedWriter write = new BufferedWriter(new FileWriter(target))) {

            while (scn.hasNextLine()) {
                String currentLine = scn.nextLine();
                String[] list = currentLine.split(",");
                int a = Integer.valueOf(list[1]);
                int b = Integer.valueOf(list[2]);
                int c = Integer.valueOf(list[3]);
                String letter = calculateLetter(a, b, c);

                write.write(list[0] + ";" + a + ";" + b + ";" + c + ";" + letter);
                write.newLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String calculateLetter(int a, int b, int c) {
        double average = (a * 3 + b * 3 + c * 4) / 10;
        if (average >= 95) {
            return "AA";
        } else if (average >= 92) {
            return "BA";
        } else if (average >= 87) {
            return "BB";
        } else if (average >= 85) {
            return "CB";
        } else if (average >= 80) {
            return "CC";
        } else if (average >= 75) {
            return "CD";
        } else if (average >= 70) {
            return "DD";
        } else {
            return "FF";
        }
    }
}
