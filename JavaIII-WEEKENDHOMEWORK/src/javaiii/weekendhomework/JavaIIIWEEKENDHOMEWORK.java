
package javaiii.weekendhomework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaIIIWEEKENDHOMEWORK {

//Global Ressources

static Scanner input = new Scanner(System.in);
static ArrayList<Todo> todoList = new ArrayList<>();    

public static void runProg() throws ParseException {
        
        //Default Value for Input
        int mainChoice=-11;
      

        
//Main Interface
        try  {
            loadDataFromFile();
            do {System.out.println("");
                System.out.println("Please Make a Choice [0-4]");
                System.out.println("0 to exit");
                System.out.println("1 to ADD");
                System.out.println("2 to LIST");
                System.out.println("3 to DELETE");
                System.out.println("4 to MODIFY");
                
                    switch(mainChoice){
                        
                        
                        case 1: addThing();
                            break;
                        case 2:listThings();
                            break;
                        case 3:deleteThing();
                            break;
                        case 4:modifyThing();
                            break;
                        case 0:saveDataToFile();
                            System.out.println("Exiting Program");
                                
                            break;
                        
                        default: System.out.println("");
                    }    
                        
                    
                System.out.print("--->");
                mainChoice = input.nextInt();
                input.nextLine();
                if(mainChoice<0||mainChoice>4){
                System.out.println("..........................................");
                System.out.println("**ERROR** AVAILABLE OPTIONS ARE FROM 0 - 4");
                     }
            } while(mainChoice != 0);
                
            
        } catch (InputMismatchException a) {
                System.out.println("you entered something bad");
                

        }
        
    }




    public static void addThing() throws ParseException{
        
        System.out.println("Please Describe the Task");
        String task = input.nextLine();
        
        System.out.println("Please Enter the date for this");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
       // String dateInput = ;
        Date dueDate = dateFormat.parse(input.nextLine());
        System.out.println("How many hours do you think this will take?");
        int hoursOfWork = input.nextInt();
        Todo newThing= new Todo(task,dueDate,hoursOfWork);
        todoList.add(newThing);
        System.out.println("Task Succesfully Added!!!");
        System.out.println(todoList.get(0).toString());
        runProg();

         }
    

    public static void listThings(){
        try{
            if(todoList.isEmpty()){
                System.out.println("nothing to do");
            }else{
                for(int i=0;i<todoList.size();i++){
                System.out.println(i + ": "+ todoList.get(i).toString());
            }
        }
        
        }catch(IllegalArgumentException e){
                System.out.println("Invalid Answer" + e.getMessage());
                }
        
    }
    public static void deleteThing(){
        System.out.println("What item would you like to remove?");
         for(int i=0;i<todoList.size();i++){
        System.out.println("#"+ i + ": "+ todoList.get(i).toString());
        todoList.remove(input.nextInt());
             System.out.println("Succesfully Deleted item # "+ i);
    }
    }
    public static void modifyThing() throws ParseException{
        System.out.println("What item would you like to Modify?");
         for(int i=0;i <= todoList.size();i++){
        System.out.println(i + ": "+ todoList.get(i).task);
        todoList.remove(input.nextInt());
        addThing();
        
    }
    }
    static final String DATA_FILE_NAME ="Todo.txt";
    
    static void loadDataFromFile() {
        try (Scanner fileInput = new Scanner(new File(DATA_FILE_NAME))){ // FileNotfoundException
            while (fileInput.hasNextLine()) {
                String dataLine = fileInput.nextLine();
                Todo item = new Todo(dataLine);
                todoList.add(item);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
     //Saving to File
    static void saveDataToFile() {
        File saveFile = new File(DATA_FILE_NAME);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(saveFile.getAbsolutePath())))  {
            for (Todo item : todoList) {
                writer.write(item.toDataString() + "\n");
            }
            
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
    }
    
    
    static int  inputInt() { 
   while(true){
        try{ int result = input.nextInt();
    input.nextLine();// consume leftover line
    return result;
    }catch(InputMismatchException ex){
        System.out.println("Invalid Input");
        input.nextLine();//consumes invalid input 
        
            }
        }
    }
    
    public static void main(String[] args) throws ParseException {
        runProg();
        
    }

}
