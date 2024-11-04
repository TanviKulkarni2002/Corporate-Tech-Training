package com.stackroute.fileio;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateLines {
    public void removeDuplicateLines() {
        Set<String> uniqueLines = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (uniqueLines.add(line)) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RemoveDuplicateLines removeDuplicateLines = new RemoveDuplicateLines();
        removeDuplicateLines.removeDuplicateLines();
    }
}
