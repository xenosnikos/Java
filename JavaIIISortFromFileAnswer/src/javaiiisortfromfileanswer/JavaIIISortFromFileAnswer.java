package javaiiisortfromfileanswer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class JavaIIISortFromFileAnswer {

    static final String DATA_FILE_NAME = "C:\\Users\\nxeno\\JavaIII\\JavaIIIDATAFROMFILE/input.txt";

    static void readDataFromFile() {
        try {
            Scanner fileInput = new Scanner(new File(DATA_FILE_NAME));
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                try {
                    double val = Integer.parseInt(line); //exception numberFromatExceptin
                    numsList.add(val);
                } catch (NumberFormatException ex) {
                    namesList.add(line);
                }
            }
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
    }
    static void computeAvgNameLen() {
        if(namesList.isEmpty()){
            System.out.println("No names, can't compute");
            return;
        }
        int sumLen=0;
        for(String name: namesList){
            sumLen += name.length();
        }
        //double avgLen = (double)sumLen / namesList.size);
       // System.out.printf("The Average length is : %.2f/n", avgLen);
    }
    static void findDupsIfNamesSorted(){
        
}
    static void findDuplicatesNames(){
        ArrayList<String> result = new ArrayList<>();
        for (int i= 0;i< 10; i++){
            String n1 = namesList.get(i);
            for (int j=i+1;j<10;j++){
                String n2 = namesList.get(j);
                if(n1.equals(n2)&& !result.contains(n2)){
                    // hash map would be better for large data sets
                    result.add(n1);
                }
            }
        }
        //System.out.print("Duplicates: " String.join(", ", result));
        System.out.println("");
    }
    
   /* static void findDupsHashSet(){
        HashSet<String>result = new HashSet<>();
        for (int i=0;){
        result.add(namesList)
    }
    }
    */
    //Write to file 
    static void findDuplicateNamesAndWriteFile(){
        ArrayList<String>result = new ArrayList<>();
        for (int i=0;1<namesList.size();i++){
            String n1= namesList.get(i);
            for(int j = i+1;j< namesList.size();j++){
                
            }
        }
    }
    
    
    
    
    
    static ArrayList<String> namesList = new ArrayList<>();
    static ArrayList<Double> numsList = new ArrayList<>();

    public static void main(String[] args) {
        readDataFromFile();
        Collections.sort(namesList);
        Collections.sort(numsList);
        System.out.println("Names:" + String.join(", ", namesList));
        System.out.println("Numbers:" + numsList.toString());//fixME
        
        
            
        
    }
}