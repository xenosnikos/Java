
package javaiiidatafromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaIIIDATAFROMFILE {

    public static void main(String[] args) {
        try {
            File listThing = new File("input.txt");
            Scanner myReader = new Scanner(listThing);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An Error occured");
            e.printStackTrace();
        }
    }
}
