/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day02todos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nxeno
 */
public class Day02TodosIT {
    
    public Day02TodosIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testInputInt() {
        System.out.println("inputInt");
        int expResult = 0;
        int result = Day02Todos.inputInt();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMenuChoice() {
        System.out.println("getMenuChoice");
        int expResult = 0;
        int result = Day02Todos.getMenuChoice();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Day02Todos.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadDataFromFile() {
        System.out.println("loadDataFromFile");
        Day02Todos.loadDataFromFile();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSaveDataToFile() {
        System.out.println("saveDataToFile");
        Day02Todos.saveDataToFile();
        fail("The test case is a prototype.");
    }
    
}
