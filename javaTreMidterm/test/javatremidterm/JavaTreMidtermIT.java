/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatremidterm;

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
public class JavaTreMidtermIT {
    
    public JavaTreMidtermIT() {
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
    public void testAddOrder() throws Exception {
        System.out.println("addOrder");
        JavaTreMidterm.addOrder();
        fail("The test case is a prototype.");
    }

    @Test
    public void testListByName() {
        System.out.println("listByName");
        JavaTreMidterm.listByName();
        fail("The test case is a prototype.");
    }

    @Test
    public void testListByDate() {
        System.out.println("listByDate");
        JavaTreMidterm.listByDate();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadDataFromFile() {
        System.out.println("loadDataFromFile");
        JavaTreMidterm.loadDataFromFile();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSaveDataToFile() {
        System.out.println("saveDataToFile");
        JavaTreMidterm.saveDataToFile();
        fail("The test case is a prototype.");
    }

    @Test
    public void testShowMenu() throws Exception {
        System.out.println("showMenu");
        JavaTreMidterm.showMenu();
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        JavaTreMidterm.main(args);
        fail("The test case is a prototype.");
    }
    
}
