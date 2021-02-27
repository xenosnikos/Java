package javaii.day2.people;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaIIDAY2People {

    static final String DATA_FILE_NAME = "C:\\Users\\nxeno\\JavaIII\\JavaII-DAY2-People/people.txt";

    private static void readWell() {
        try ( Scanner fileInput = new Scanner(new File(DATA_FILE_NAME))) {
            while (fileInput.hasNextLine()) {
                try {
                    String line = fileInput.nextLine();
                    String[] data = line.split(";");
                    String Name = data[0];
                    int age = Integer.parseInt(data[1]);
                    Person person = new Person(Name, age);
                    people.add(person);
                } catch (NumberFormatException ex) {
                    System.out.println("Error paring interger");
                } catch (InvalidDataException ex) {
                    System.out.println("Error in data,Skipping line: " + ex.getMessage());
                }
            }
        
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }
    }
    public 

    static void readDataFromFile() {
        try {
            Scanner fileInput = new Scanner(new File(DATA_FILE_NAME));
            while (fileInput.hasNextLine()) {
                String line = fileInput.next();
                try {
                    double val = Double.parseDouble(line); //exception numberFromatExceptin
                    ageList.add(val);
                } catch (NumberFormatException ex) {
                    namesList.add(line);
                }
            }
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
    }

    static void readAnotherWay() {
        try {
            File listThing = new File("people.txt");
            try ( Scanner myReader = new Scanner(listThing)) {

                while (myReader.hasNext()) {
                    String data = myReader.nextLine();

                    System.out.println(data);

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An Error occured");
            e.printStackTrace();
        }
    }
    static ArrayList<Person> people = new ArrayList<>();
    static ArrayList<String> namesList = new ArrayList<>();
    static ArrayList<Double> ageList = new ArrayList<>();

    public static void main(String[] args) {
        //Person p0= new Person("Tom", 30); 
        //Person p1 = new Person("Jerry",20);
        readDataFromFile();
        // readAnotherWay();
        System.out.println("Names: " + String.join(", ", namesList));
        System.out.println("Ages: " + ageList.toString());
    }

}
