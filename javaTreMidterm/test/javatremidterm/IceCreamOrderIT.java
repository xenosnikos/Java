/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatremidterm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class IceCreamOrderIT {

    public IceCreamOrderIT() {
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
    public void testGetName() {
        System.out.println("getName");
        IceCreamOrder instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetName1() {
        System.out.println("setName");
        String name = "Ronny";
        IceCreamOrder instance = new IceCreamOrder();
        instance.setName(name);
        assertEquals(instance.name, name);
        fail("this din't work");
    }

    @Test
    public void testSetName2() {
        System.out.println("setName");
        String name = "George";
        IceCreamOrder instance = new IceCreamOrder();
        instance.setName(name);
        assertEquals(instance.name, name);
        fail("this din't work.");
    }

    @Test
    public void testSetName3() throws DataInvalidException {
        System.out.println("setName");
        String name = "*&(";
        IceCreamOrder instance = new IceCreamOrder();
        instance.setName(name);
        assertEquals(instance.name, name);
        fail("this din't work.");
    }

    @Test
    public void testSetName4() throws DataInvalidException {
        System.out.println("setName");
        String name = "09890";
        IceCreamOrder instance = new IceCreamOrder();
        instance.setName(name);
        assertEquals(instance.name, name);
        fail("this din't work.");
    }

    @Test
    public void testSetDelivDate1() {
        System.out.println("setDelivDate");
        Date date = new Date();
        Date delivDate = date;
        IceCreamOrder instance = new IceCreamOrder();
        try {
            instance.setDelivDate(delivDate);
        } catch (DataInvalidException ex) {
            Logger.getLogger(IceCreamOrderIT.class.getName()).log(Level.SEVERE, null, ex);
        }
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDelivDate2() {
        System.out.println("setDelivDate");

        IceCreamOrder instance = new IceCreamOrder();
        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        try {
            instance.setDelivDate(today);
        } catch (DataInvalidException ex) {
            Logger.getLogger(IceCreamOrderIT.class.getName()).log(Level.SEVERE, null, ex);
        }
        fail("That didn't work");
    }

    @Test
    public void testSetDelivDate3() throws Exception {
        System.out.println("setDelivDate");
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2022");

        IceCreamOrder instance = new IceCreamOrder();
        instance.setDelivDate(date);
        fail("That didn't work");
    }

    @Test
    public void testSetDelivDate4() throws Exception {
        System.out.println("setDelivDate");
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("20/01/2021");
        IceCreamOrder instance = new IceCreamOrder();
        instance.setDelivDate(date);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFlavList() {
        System.out.println("getFlavList");
        IceCreamOrder instance = null;
        ArrayList<IceCreamOrder.Flavour> expResult = null;
        ArrayList<IceCreamOrder.Flavour> result = instance.getFlavList();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFlavList() {
        System.out.println("setFlavList");
        ArrayList<IceCreamOrder.Flavour> flavList = null;
        IceCreamOrder instance = null;
        instance.setFlavList(flavList);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        IceCreamOrder instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToDataString() {
        System.out.println("toDataString");
        IceCreamOrder instance = null;
        String expResult = "";
        String result = instance.toDataString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
