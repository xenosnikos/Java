/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiii.apointments;

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
public class JavaIIIApointmentsTest {
    
    public JavaIIIApointmentsTest() {
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
    public void testAddApp() throws Exception {
        System.out.println("addApp");
        JavaIIIApointments.addApp();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoadDataFromFile() {
        System.out.println("loadDataFromFile");
        JavaIIIApointments.loadDataFromFile();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSaveDataToFile() {
        System.out.println("saveDataToFile");
        JavaIIIApointments.saveDataToFile();
        fail("The test case is a prototype.");
    }

    @Test
    public void testListByDate() {
        System.out.println("listByDate");
        JavaIIIApointments.listByDate();
        fail("The test case is a prototype.");
    }

    @Test
    public void testListByName() {
        System.out.println("listByName");
        JavaIIIApointments.listByName();
        fail("The test case is a prototype.");
    }

    @Test
    public void testListByReason() {
        System.out.println("listByReason");
        JavaIIIApointments.listByReason();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRunProg() throws Exception {
        System.out.println("runProg");
        JavaIIIApointments.runProg();
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        JavaIIIApointments.main(args);
        fail("The test case is a prototype.");
    }
    
}
