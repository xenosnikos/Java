/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiii.apointments;

import java.util.Date;
import java.util.HashSet;
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
public class AppointmentTest {
    
    public AppointmentTest() {
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
    public void testGetDate() {
        System.out.println("getDate");
        Appointment instance = null;
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Appointment instance = null;
        instance.setDate(date);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDurationMinutes() {
        System.out.println("getDurationMinutes");
        Appointment instance = null;
        int expResult = 0;
        int result = instance.getDurationMinutes();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDurationMinutes() throws Exception {
        System.out.println("setDurationMinutes");
        int durationMinutes = 0;
        Appointment instance = null;
        instance.setDurationMinutes(durationMinutes);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Appointment instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Appointment instance = null;
        instance.setName(name);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Appointment instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Appointment instance = null;
        instance.setDescription(description);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetReasonList() {
        System.out.println("getReasonList");
        Appointment instance = null;
        HashSet<Appointment.Reason> expResult = null;
        HashSet<Appointment.Reason> result = instance.getReasonList();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetReasonList() {
        System.out.println("setReasonList");
        HashSet<Appointment.Reason> reasonList = null;
        Appointment instance = null;
        instance.setReasonList(reasonList);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Appointment instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToDataString() {
        System.out.println("toDataString");
        Appointment instance = null;
        String expResult = "";
        String result = instance.toDataString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
