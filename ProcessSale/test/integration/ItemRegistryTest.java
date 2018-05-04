/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

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
public class ItemRegistryTest {
    
    public ItemRegistryTest() {
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
     * Test of findItem method, of class ItemRegistry.
     */
    @Test
    public void testFindLK() {
        System.out.println("findItem");
        String itemID = "LK";
        ItemRegistry instance = new ItemRegistry();
        ItemDTO expResult = instance.getItem(0);
        ItemDTO result = instance.findItem(itemID);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFindMK() {
        System.out.println("findItem");
        String itemID = "MK";
        ItemRegistry instance = new ItemRegistry();
        ItemDTO expResult = instance.getItem(1);
        ItemDTO result = instance.findItem(itemID);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFindSK() {
        System.out.println("findItem");
        String itemID = "SK";
        ItemRegistry instance = new ItemRegistry();
        ItemDTO expResult = instance.getItem(2);
        ItemDTO result = instance.findItem(itemID);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFindWrongID() {
        System.out.println("findItem");
        String itemID = "WrongID";
        ItemRegistry instance = new ItemRegistry();
        ItemDTO expResult = null;
        ItemDTO result = instance.findItem(itemID);
        assertEquals(expResult, result);
    }
}
