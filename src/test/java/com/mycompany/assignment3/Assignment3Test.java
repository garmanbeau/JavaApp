/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.assignment3;

import static org.junit.Assert.*;

/**
 *
 * @author garma
 */
public class Assignment3Test {
    
    public Assignment3Test() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() {
    }

    @org.junit.AfterClass
    public static void tearDownClass(){
    }

    @org.junit.Before
    public void setUp() {
    }

    @org.junit.After
    public void tearDown(){
    }
    

    /**
     * Test of findMax method, of class Assignment3.
     */
    @org.junit.Test
    public void testFindMax() {
        assertEquals(4,Assignment3.findMax(new int[]{1,3,4,2}));  
      assertEquals(-1,Assignment3.findMax(new int[]{-12,-1,-3,-4,-2})); 
    }
    
}
