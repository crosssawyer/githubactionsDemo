/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicdcovdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nathane
 */
public class MainTest {
    
    public MainTest() {
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
     * Test of collatz method, of class Main.
     */
    @Test
    public void testCollatzBase() {
        int n = 1;
        int expResult = 0;
        int result = Main.collatz(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCollatzEven() {
        int n = 4;
        int expResult = 2;
        int result = Main.collatz(n);
        assertEquals(expResult, result);
    }
    
}
