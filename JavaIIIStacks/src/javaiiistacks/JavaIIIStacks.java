/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiiistacks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Scanner;

/**
 *
 * @author nxeno
 */
public class JavaIIIStacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Display All *.txt files
       
        System.out.println("The following *.txt files have been found in the current directory:");
        try {
            File f = new File("C:\\Users\\Jess\\Documents\\java3\\Day01StackInterpreter");
            
            FilenameFilter filter = new FilenameFilter() {
               @Override
               public boolean accept(File f, String name) {
                   return name.endsWith(".txt");
               }
            };
            
            File[] files = f.listFiles(filter);
            
            for (File file : files) {
                System.out.println(file.getName());
            }
            
            //Pick a *.txt file from the directory
            System.out.println();
            System.out.print("Enter the name of a file to use: ");
        
            Scanner input = new Scanner(System.in);
            String fileName = input.nextLine();
            System.out.println();
            if(null == fileName) {
                fahToCel();
            } else switch (fileName) {
                case "addtwo.txt":
                    addTwo();
                    break; 
                case "cel2fah.txt":
                    celToFah();
                    break;
                default:
                    fahToCel();
                    break;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    
}
