
package javaiiisortfromfileattempt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class JavaIIISortFromFileAttempt {

    
    public static void main(String[] args) {

    {   
        int totalWordLength=0;
        BufferedReader reader = null; 
         
        BufferedWriter writer = null;
                 
        //Create an ArrayList object to hold the lines of input file
         
        ArrayList<String> lines = new ArrayList<String>();
         
        try
        {
            //Creating BufferedReader object to read the input file
             
            reader = new BufferedReader(new FileReader("C:\\Users\\nxeno\\JavaIII\\JavaIIIDATAFROMFILE/input.txt"));
             
            //Reading all the lines of input file one by one and adding them into ArrayList
             
            String currentLine = reader.readLine();
             
            while (currentLine != null) 
            {
                lines.add(currentLine);
                 
                currentLine = reader.readLine();
            //    totalWordLength += currentLine.length();
            }
            
           //int averageLength= Math.round(totalWordLength/(double)lines.size());
             
            //Sorting the ArrayList
             
            Collections.sort(lines);
             
             System.out.println("Numbers:");
             System.out.println(lines.subList(0,6));
             System.out.println("Names:");
             System.out.println(lines.subList(6, 15));
             System.out.println("");
            
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            //Closing the resources
             
            try
            {
                if (reader != null)
                {
                    reader.close();
                }
                 
                if(writer != null)
                {
                    writer.close();
                }
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }   
}
    }
    

