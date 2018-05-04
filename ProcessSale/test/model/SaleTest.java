/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import integration.ItemDTO;
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
public class SaleTest {
    
    public SaleTest() {
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
     * Test of addItem method, of class Sale.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        ItemDTO registeredItem = new ItemDTO(10, "liten kaffe", 0.12, "LK");
        Sale instance = new Sale();
        String expResult = "10kr, liten kaffe, 10kr";
        String result = instance.addItem(registeredItem);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddItemTwice() {
        System.out.println("addItemTwice");
        ItemDTO registeredItem = new ItemDTO(10, "liten kaffe", 0.12, "LK");
        Sale instance = new Sale();
        String expResult = "10kr, liten kaffe, 20kr";
        instance.addItem(registeredItem);
        String result = instance.addItem(registeredItem);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddItemDifferent() {
        System.out.println("addItemDifferent");
        ItemDTO registeredItem1 = new ItemDTO(10, "liten kaffe", 0.12, "LK");
        ItemDTO registeredItem2 = new ItemDTO(15, "mellan kaffe", 0.12, "MK");
        Sale instance = new Sale();
        String expResult = "15kr, mellan kaffe, 25kr";
        instance.addItem(registeredItem1);
        String result = instance.addItem(registeredItem2);
        assertEquals(expResult, result); 
    }
    
    /**
     * 
     */
    @Test
    public void testAddItems() {
        System.out.println("addItems");
        ItemDTO registeredItem = new ItemDTO(10, "liten kaffe", 0.12, "LK");
        Sale instance = new Sale();
        String expResult = "10kr, liten kaffe, 30kr";
        String result = instance.addItems(registeredItem, 3);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddItemsTwice() {
        System.out.println("addItemsTwice");
        ItemDTO registeredItem = new ItemDTO(10, "liten kaffe", 0.12, "LK");
        Sale instance = new Sale();
        String expResult = "10kr, liten kaffe, 40kr";
        instance.addItems(registeredItem, 2);
        String result = instance.addItems(registeredItem, 2);
        assertEquals(expResult, result);
    }

    @Test
    public void testAddItemAndItems() {
        System.out.println("addItemAndItems");
        ItemDTO registeredItem = new ItemDTO(10, "liten kaffe", 0.12, "LK");
        Sale instance = new Sale();
        String expResult = "10kr, liten kaffe, 30kr";
        instance.addItem(registeredItem);
        String result = instance.addItems(registeredItem, 2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddItemsAndItem() {
        System.out.println("addItemsandItem");
        ItemDTO registeredItem = new ItemDTO(10, "liten kaffe", 0.12, "LK");
        Sale instance = new Sale();
        String expResult = "10kr, liten kaffe, 30kr";
        instance.addItems(registeredItem, 2);
        String result = instance.addItem(registeredItem);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddDifferentItems() {
        System.out.println("addDifferentItems");
        ItemDTO registeredItem1 = new ItemDTO(10, "liten kaffe", 0.12, "LK");
        ItemDTO registeredItem2 = new ItemDTO(15, "mellan kaffe", 0.12, "MK");
        Sale instance = new Sale();
        String expResult = "15kr, mellan kaffe, 35kr";
        instance.addItems(registeredItem1, 2);
        String result = instance.addItem(registeredItem2);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of calculateTaxes method, of class Sale.
     */
    @Test
    public void testCalculateTaxes() {
        System.out.println("calculateTaxes");
        ItemDTO registeredItem = new ItemDTO(10, "liten kaffe", 0.12, "LK");
        Sale instance = new Sale();
        instance.addItem(registeredItem);
        double expResult = 1.2;
        double result = instance.calculateTaxes();
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalculateTaxesMultiple() {
        System.out.println("calculateTaxesMultiple");
        ItemDTO registeredItem1 = new ItemDTO(10, "liten kaffe", 0.12, "LK");
        ItemDTO registeredItem2 = new ItemDTO(15, "mellan kaffe", 0.12, "MK");
        Sale instance = new Sale();
        instance.addItem(registeredItem1);
        instance.addItem(registeredItem2);
        double expResult = 3.0;
        double result = instance.calculateTaxes();
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalculateTaxesNone() {
        System.out.println("calculateTaxesNone");
        Sale instance = new Sale();
        double expResult = 0;
        double result = instance.calculateTaxes();
        assertEquals(expResult, result, 0);
    }
}
