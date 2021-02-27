
package javaiii.weekendhomework;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaIIIWEEKENDHOMEWORK {

//Global Ressources
static Scanner input = new Scanner(System.in);
static ArrayList<Todo> todoList = new ArrayList<>();    

    public static void addThing(){
        
            
        
        
        Todo newThing= new Todo();
        
        System.out.println("Please Describe the Task");
        newThing.task = input.nextLine();
        System.out.println("Please Enter the date for this");
        newThing.dueDate =  input.next(); // must fix
        System.out.println("How many hours do you think this will take?");
        newThing.hoursOfWork= input.nextInt();
        
        todoList.add(newThing);

         }
    

    public static void listThings(){
        for(int i=0;1<todoList.size();i++){
        System.out.println(i + ": "+ todoList.get(i).task);
    }
    }
    public static void deleteThing(){
        System.out.println("What item would you like to remove?");
         for(int i=0;1<todoList.size();i++){
        System.out.println(i + ": "+ todoList.get(i).task);
        todoList.remove(input.nextInt());
    }
    }
    public static void modifyThing(){
        System.out.println("What item would you like to Modify?");
         for(int i=0;1<todoList.size();i++){
        System.out.println(i + ": "+ todoList.get(i).task);
        todoList.remove(input.nextInt());
        addThing();
        
    }
    }
    public static void runProg() {
        
        //Default Value for Input
        int mainChoice = -1;
      
//Computation Options 
       
        ArrayList<String> compOptions = new ArrayList<>();
        compOptions.add("Exit");
        compOptions.add("Add a todo");
        compOptions.add("List all todos");
        compOptions.add("Delete a todo");
        compOptions.add("Modify a todo");
        
//Main Interface
        while (mainChoice != 0) {

            try {
                System.out.println("");
                System.out.println("Please Make a Choice [0-4]");
                System.out.println();
                for (int i = 0; i < compOptions.size(); i++) {
                    System.out.println((i)+" : " + compOptions.get(i));
                    
                    switch(mainChoice){
                        case 0:System.out.println("Exiting Program");
                                
                            break;
                        case 1: addThing();
                            break;
                        case 2:listThings();
                            break;
                        case 3:deleteThing();
                            break;
                        case 4:modifyThing();
                            break;
                        
                        default: System.out.println("");
                    }    
                        
                    
                }System.out.print("--->");
                     mainChoice = input.nextInt();
                     if(mainChoice<0||mainChoice>4){
                         System.out.println("..........................................");
                         System.out.println("**ERROR** AVAILABLE OPTIONS ARE FROM 0 - 4");
                     }
            } catch (InputMismatchException a) {
                System.out.println("you entered something bad");
                return;
                
            }
        }

         
    }

    public static void main(String[] args) {
        runProg();
    }

}
