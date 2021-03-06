/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiii.weekendhomework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class TodoTest {
    
    public TodoTest() {
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
    public void testGetStatus() {
        System.out.println("getStatus");
        Todo instance = null;
        Todo.TaskStatus expResult = null;
        Todo.TaskStatus result = instance.getStatus();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        Todo.TaskStatus status = null;
        Todo instance = null;
        instance.setStatus(status);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTask() {
        System.out.println("getTask");
        Todo instance = null;
        String expResult = "";
        String result = instance.getTask();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTask() {
        System.out.println("setTask");
        String task = "";
        Todo instance = null;
        instance.setTask(task);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDueDate() {
        System.out.println("getDueDate");
        Todo instance = null;
        Date expResult = null;
        Date result = instance.getDueDate();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDueDate() {
        System.out.println("setDueDate");
        Date dueDate = null;
        Todo instance = null;
        instance.setDueDate(dueDate);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHoursOfWork() {
        System.out.println("getHoursOfWork");
        Todo instance = null;
        int expResult = 0;
        int result = instance.getHoursOfWork();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHoursOfWork() {
        System.out.println("setHoursOfWork");
        int hoursOfWork = 0;
        Todo instance = null;
        instance.setHoursOfWork(hoursOfWork);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Todo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToDataString() throws ParseException {
        System.out.println("toDataString");
        Todo instance = null;
        Date date= new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2001");
        Todo instanced;
        Todo instanced = new Todo("Run this test", date, 3 , Todo.TaskStatus.PENDING);
        String expResult = "Run this test;2001-10-20;3;Pending";
        
        String expResult = "Run this test;2001-10-20;3;Pending";
        String result = instance.toDataString();
        assertEquals(expResult, result);
       
    }
    
}
