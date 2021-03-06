
package javaiii.apointments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import javaiii.apointments.Appointment.Reason;


public class JavaIIIApointments {
static Scanner input = new Scanner(System.in);
static ArrayList<String> reasonArray=new ArrayList<>();
static ArrayList<Appointment> appList = new ArrayList<>();

    static void addApp() throws Exception{
        try {
            System.out.println("Requesting Appointment");
            System.out.println("What's your name?");
            String name= input.nextLine();
            System.out.print("Enter the Date for your appointment yyyy-mm-dd)");
            
            
            
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dueDate = dateFormat.parse(input.nextLine());
            
            String dueDateStr = dateFormat.format(dueDate);
            
            
            System.out.print("At what time? ");
            String time = input.nextLine();
            LocalTime lt = LocalTime.parse(time);
            String dateTimeStr= dueDateStr +" "+ lt;
            Date date=dateFormat.parse(dateTimeStr);
            System.out.println("Whats the reason for your appointment?");
            System.out.println("CHECKUP, REFERRAL,TESTS,FOLLOWUP, UNWELL");
            String reasonStr=input.nextLine();
            String[] splitReasons = reasonStr.split(",");
            for (String splitReason : splitReasons) {
                reasonList.add(Appointment.Reason.valueOf(splitReason));
            }
            System.out.println("How long do you estimate this will take? 20, 40 or 60 minutes?");
            int durationMinutes=input.nextInt();
            System.out.println("Do you have ant comments to add?");
            String description=input.nextLine();
            
            Appointment rdvz = new Appointment(date,durationMinutes,name,description,reasonList);
            
            appList.add(rdvz);
           
            System.out.println("You've created the Appointment");
            
            System.out.println(appList.get(0));
            //runProg();
           saveDataToFile();
        } catch (ParseException | NumberFormatException ex) {
            System.out.println("Error parsing: " + ex.getMessage());
        
    }
    }
        final static String DATA_FILE_NAME = "todos.txt";

    static void loadDataFromFile(){
        try (Scanner inputFile = new Scanner(new File(DATA_FILE_NAME))) {
            while (inputFile.hasNextLine()) {
                String line = "";
                try {
                    line = inputFile.nextLine();
                    appList.add(new Appointment(line)); // ex DataInvalidException
                } catch (Exception ex) {
                    System.out.printf("Error parsing line (%s) ignoring: %s\n", ex.getMessage(), line);
                }
            }
        } catch (FileNotFoundException ex) {
            // ignore, it's okay if the file is not there
        }
    }    
static void saveDataToFile() { // calls todo.toDataString();
        try (PrintWriter outputFile = new PrintWriter(new File(DATA_FILE_NAME))) {
            for (Appointment rdvz : appList) {
                outputFile.println(rdvz.toDataString());
            }
        } catch (IOException ex) {
            System.out.println("Error writing data back to file");
        }
    }    
        
        
        
    
    static void listByDate(){
        
    }
    static void listByName(){
        
    }
    static void listByReason(){
        
    }
    
    static void runProg() throws Exception{
        int choice=-1;
   do{
       loadDataFromFile();
       System.out.println("1. Make an appointment\n"
               + "2. List Apointment by Date\n"
               + "3. List Apointment by Name\n"
               + "4. List Apointment by their first Reason\n"
               + "0. Exit");
       switch(choice){
                        case 1: addApp();
                            break;
                        case 2:listByDate();
                            break;
                        case 3:listByName();
                            break;
                        case 4:listByReason();
                            break;
                        case 0:
                            System.out.println("Exiting Program");
                            return;    
                            
                        
                        default: System.out.println("");
                        
       }System.out.print("--->");
                choice = input.nextInt();
                input.nextLine();
                if(choice<0||choice>4){
                System.out.println("..........................................");
                System.out.println("**ERROR** AVAILABLE OPTIONS ARE FROM 0 - 4");
                }
   }while(true);
}
   
    public static void main(String[] args) throws Exception {
      runProg();
       // System.out.println(java.util.Arrays.asList(Appointment.Reason.values()));
        
    }

}

//5-10 unit tests 