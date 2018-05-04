/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import integration.AccountingSystem;
import integration.InventorySystem;
import integration.RegistryCreator;
import integration.Printer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Robert Lillnor
 */
public class ControllerTest {
    
    public ControllerTest() {
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

    /**
     * Test of startSale method, of class Controller.
     */
    @Test
    public void testStartSale() {
        System.out.println("startSale");
        RegistryCreator regCreator = new RegistryCreator();
        Controller instance = new Controller(regCreator);
        instance.startSale();
    }

    /**
     * Test of enterItemID method, of class Controller.
     */
    @Test
    public void testEnterItemID() {
        System.out.println("enterItemID");
        String itemID = "SK";
        RegistryCreator regCreator = new RegistryCreator();
        Controller instance = new Controller(regCreator);
        instance.startSale();
        String expResult = "20kr, stor kaffe, 20kr";
        String result = instance.enterItemID(itemID);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndicateAllItemsRegistered() {
        System.out.println("enterIndicateAllItemsRegistered");
        String itemID1 = "LK";
        String itemID2 = "MK";
        String itemID3 = "SK";
        RegistryCreator regCreator = new RegistryCreator();
        Controller instance = new Controller(regCreator);
        instance.startSale();
        double expResult = 16.2;
        System.out.println(instance.enterItemID(itemID1));
        System.out.println(instance.enterItemIDAndQuantity(itemID2, 3));
        System.out.println(instance.enterItemID(itemID3));
        System.out.println(instance.enterItemID(itemID3));
        System.out.println(instance.enterItemIDAndQuantity(itemID1, 2));
        System.out.println(instance.enterItemIDAndQuantity(itemID3, 1));
        double result = instance.indicateAllItemsRegistered();
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testIndicateAllItemsRegistered2() {
        System.out.println("enterIndicateAllItemsRegistered2");
        String itemID = "SK";
        RegistryCreator regCreator = new RegistryCreator();
        Controller instance = new Controller(regCreator);
        instance.startSale();
        double expResult = 7.2;
        instance.enterItemID(itemID);
        instance.enterItemID(itemID);
        instance.enterItemIDAndQuantity(itemID,1);
        double result = instance.indicateAllItemsRegistered();
        assertEquals(expResult, result, 0.01);
     }

    /**
     * Test of enterPaidCash method, of class Controller.
     */
    @Test
    public void testEnterPaidCash() {
        System.out.println("enterPaidCash");
        int paidAmount                = 80;
        RegistryCreator regCreator    = new RegistryCreator();
        Printer printer               = new Printer();
        AccountingSystem accounting   = new AccountingSystem();
        InventorySystem inventory     = new InventorySystem();
        Controller instance           = new Controller(regCreator, printer, accounting, inventory);
        instance.startSale();
        System.out.println(instance.enterItemID("LK"));
        System.out.println(instance.enterItemIDAndQuantity("SK", 3));
        System.out.println(instance.indicateAllItemsRegistered());
        int expResult = 10;
        int result = instance.enterPaidCash(paidAmount);
        assertEquals(expResult, result);
    }
}
