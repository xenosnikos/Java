/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiii.minmax;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nxeno
 */
public class JavaIIIMINMAX {

    /**
     * @param args the command line arguments
     */
    static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       
        
try{

   
  
    System.out.println("How Many Numbers Do you Want?  ");
    int numberOfNumbers = input.nextInt();
    if (numberOfNumbers<0){
        System.out.println("ERROR: Number Cant be Negative");
        System.exit(1);
    }
    System.out.println("what's the minimum?");
    int minNum= input.nextInt();
    System.out.println("what's the maximum?");
    int maxNum = input.nextInt();
    if (maxNum < minNum){
        System.out.println("error max must be more than min");
    }
       
    System.out.println("results:");
    for(int i=0;i<numberOfNumbers;i++){
    int val = (int)(Math.random()*(maxNum-minNum+1) +minNum);
    System.out.printf("%s%d",(i== 0 ? "": ","),val);
    }
    System.out.println();
}catch (InputMismatchException ex){
    System.out.println("ERROR");
}
    }
}
    

   
    

   
    

