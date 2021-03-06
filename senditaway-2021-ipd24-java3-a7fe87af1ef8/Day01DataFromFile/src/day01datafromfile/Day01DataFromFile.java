package day01datafromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Day01DataFromFile {

    static final String DATA_FILE_NAME = "input.txt";
    
    static void readDataFromFile() {
        try (Scanner fileInput = new Scanner(new File(DATA_FILE_NAME))) {
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                try {
                    double val = Double.parseDouble(line); // exception NumberFormatException
                    numsList.add(val);
                } catch (NumberFormatException ex) {
                    namesList.add(line);
                }
            }
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }
    }
    
    static void computeAvgNameLen() {
        if (namesList.isEmpty()) {
            System.out.println("No names, can't compute the average length");
            return;
        }
        int sumLen = 0;
        for (String name : namesList) {
            sumLen += name.length();
        }
        double avgLen = (double)sumLen / namesList.size();
        System.out.printf("The average length of a name is: %.2f\n", avgLen);
    }
    
    static final String OUTPUT_DUPS_FILE_NAME = "duplicates.txt";
    
    static void findDuplicateNamesAndWriteToFile() {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < namesList.size(); i++) {
            String n1 = namesList.get(i);
            for (int j = i + 1; j < namesList.size(); j++) {
                String n2 = namesList.get(j);
                if (n1.equals(n2) && !result.contains(n2)) {
                    // hash map would be better for large data sets
                    result.add(n1);
                }
            }
        }
        System.out.print("Duplicates: " + String.join(", ", result));
        System.out.println("");
        // Write to file
        try (PrintWriter outputFile = new PrintWriter(new File(OUTPUT_DUPS_FILE_NAME))) {
            for (String name : result) {
                outputFile.println(name);
            }
        } catch (IOException ex) {
            System.out.println("Error writing to file: " + ex.getMessage());
        }
        
    }
    
    static void findDuplicateNamesWithHashSet() {
        HashSet<String> result = new HashSet<>();
        for (int i = 0; i < namesList.size(); i++) {
            String n1 = namesList.get(i);
            for (int j = i + 1; j < namesList.size(); j++) {
                String n2 = namesList.get(j);
                if (n1.equals(n2)) {
                    // hash map would be better for large data sets
                    result.add(n1);
                }
            }
        }
        System.out.print("Duplicates (via HashSet): " + String.join(", ", result));
        System.out.println("");
        
    }
    
    static ArrayList<String> namesList = new ArrayList<>();
    static ArrayList<Double> numsList = new ArrayList<>();
    
    public static void main(String[] args) {
        readDataFromFile();
        Collections.sort(namesList);
        Collections.sort(numsList);
        System.out.println("Names: " + String.join(", ", namesList));
        System.out.println("Numbers: " + numsList.toString()); // FIXME
        computeAvgNameLen();
        findDuplicateNamesAndWriteToFile();
        findDuplicateNamesWithHashSet();
        System.out.println("done");
    }
    
}
