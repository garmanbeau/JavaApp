/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.assignment3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author garma
 */
public class BoundedQueueTest {
    
    private BoundedQueue bQueue; 
    
    public BoundedQueueTest() {
    }
    
    @Before
    public void setUp() {
        bQueue = new BoundedQueue(3);
        int a=1, b=2, c=3;
        bQueue.enQueue(a);
        bQueue.enQueue(b);
        bQueue.enQueue(c);
    }
    
    @After
    public void tearDown() {
        bQueue = null;
    }

    /**
     * Test of enQueue method, of class BoundedQueue.
     */
    @Test
    public void testEnQueue() {
        System.out.println("enQueue");
        
        String expResult ="[1, 2, 3]";
        
        assertEquals(expResult, bQueue.toString());
    }

    /**
     * Test of deQueue method, of class BoundedQueue.
     */
    @Test
    public void testDeQueue() {
        System.out.println("deQueue");
        
        String expResult ="[2, 3]";
        
        bQueue.deQueue();
        
        assertEquals(expResult, bQueue.toString());
    }

    /**
     * Test of isEmpty method, of class BoundedQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        
        assertTrue("testIsEmpty() Failed", !bQueue.isEmpty());
    }

    /**
     * Test of isFull method, of class BoundedQueue.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        
        assertTrue("testIsFull() Failed", bQueue.isFull()); 
    }

    /**
     * Test of toString method, of class BoundedQueue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "[1, 2, 3]";
        assertEquals(expResult, bQueue.toString());
    }
    
}
