
package javaiii.midterm;

import java.util.Scanner;


public class JavaIIIMidterm {
    static Scanner input = new Scanner(System.in);
    
    
    
static void showMenu(){
   
   int choice=-1;
   do{
       //loadDataFromFile();
       System.out.println("1. Add an Order\n"
               + "2. List by custmer name\n"
               + "3. List Apointment by delivery date\n"
               + "0. Exit");
       switch(choice){
                        case 1: addOrder();
                            break;
                        case 2:listByName();
                            break;
                        case 3:listByDate();
                            break;
                        case 0:
                            System.out.println("Exiting Program");
                            return;    
                            
                        
                        default: System.out.println("");
                        
       }System.out.print("--->");
                choice = input.nextInt();
                input.nextLine();
                if(choice<0||choice>3){
                System.out.println("..........................................");
                System.out.println("**ERROR** AVAILABLE OPTIONS ARE FROM 0 - 3");
                }
   }while(true);

       }

static void addOrder(){
    
}
static void listByName(){
    
}
static void listByDate(){
    
}


  static void main(String[] args) {
        
      showMenu();
    
  
  }
    
}
