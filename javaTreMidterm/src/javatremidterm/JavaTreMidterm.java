package javatremidterm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;
import java.util.Scanner;
import javatremidterm.IceCreamOrder.Flavour;

public class JavaTreMidterm {

static Scanner input = new Scanner(System.in);
static ArrayList<IceCreamOrder> ordersList = new ArrayList<>();    
static ArrayList<Flavour> flavList= new ArrayList<>();    
static void addOrder() throws ParseException, DataInvalidException{
    
    System.out.println("Please Enter Custumers Name");
    String name= input.nextLine();
    System.out.println("Please Enter The Prefered Delivery Date");
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String dateStr=input.nextLine();
    
    System.out.println("Around What time is most convinient?");
    String time = input.nextLine();
    LocalTime lt = LocalTime.parse(time);
    String dateTimeStr= dateStr +" "+ lt;
    Date date= dateFormat.parse(dateStr);
    System.out.println("Pick All Your Favorite Flavours! leave empty to exit");  
    System.out.println(java.util.Arrays.asList(Flavour.values()));
// for (Flavour flavours : EnumSet.allOf(Flavour.class)) {System.out.println(flavours)}
//for (IceCreamOrder.Flavour flavours : IceCreamOrder.Flavour.values()) {System.out.println(flavours)} ;   
                
          
    String flavEntry = null;
   
    do{
    
    flavEntry=input.nextLine();
   // if( !EnumUtil.isValidEnum(Flavour.class,flavEntry)){
        
   // } else {
   //     }
    if(!flavEntry.isBlank()) {
     
        flavList.add(IceCreamOrder.Flavour.valueOf(flavEntry.toUpperCase()));
               
    }
    
   
    }while(!"".equals(flavEntry));
    
    
    IceCreamOrder newScoop = new IceCreamOrder(name,date,flavList);
    ordersList.add(newScoop);
    System.out.println("ORDER ACCEPTED");
    System.out.println(newScoop.toString());
    

}
static String listByName(){
    if(ordersList.size()<1){
        System.out.println("Order Queue is currently empty");
    }
    ordersList.sort((IceCreamOrder newScoop1,IceCreamOrder newScoop2) -> newScoop1.getName().compareTo(newScoop2.getName()));
    return ordersList.toString();
}
static String  listByDate(){
    if(ordersList.size()<1){
        System.out.println("Order Queue is currently empty");
    }
    ordersList.sort((IceCreamOrder newScoop1,IceCreamOrder newScoop2) -> newScoop1.getDelivDate().compareTo(newScoop2.getDelivDate()));
    return ordersList.toString();
}

final static String DATA_FILE_NAME = "orders.txt";
static void loadDataFromFile(){
   try (Scanner inputFile = new Scanner(new File(DATA_FILE_NAME))) {
            while (inputFile.hasNextLine()) {
                String dataLine = "";
                try {
                    dataLine = inputFile.nextLine();
                   
                } catch (Exception ex) {
                    System.out.printf("Error parsing line (%s) ignoring: %s\n", ex.getMessage(), dataLine);
                }
            }
        } catch (FileNotFoundException ex) {
            // ignore, it's okay if the file is not there
        }
}
static void saveDataToFile(){
    try (PrintWriter outputFile = new PrintWriter(new File(DATA_FILE_NAME))) {
            for (IceCreamOrder newScoop : ordersList) {
                outputFile.println(newScoop.toDataString());
            }
        } catch (IOException ex) {
            System.out.println("Error writing data back to file");
        }
}
static void showMenu() throws ParseException, DataInvalidException{
   
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
                            //saveDataToFile();
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
    
    public static void main(String[] args) throws ParseException, DataInvalidException {
showMenu();
        
        
        
    }
}
