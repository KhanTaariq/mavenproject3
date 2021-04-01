/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ca.cput.testmaven3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;


/**
 * @Student number: 206006330
 * @author Tumelo Mzaca
 */
public class testMavenTdd3Test {
    //declarations
    private testMavenTdd3 test1;
    private testMavenTdd3 test2;
    
    @BeforeEach
  public void setUp()
    {
        test1 = new testMavenTdd3();
        test2 = new testMavenTdd3();
    }
    
    @Test
    public void testEquality()
    {
        assertTrue(test1.equals(test1));
    }
   
    @Test
    public void testIdentity()
    {
        assertSame(test1, test1);
    }
    
    @Test
    public void testFailingTest()
    {
        assertNotSame(tes1, test2);
        fail("Failed test deliberately");
    }    
  
    @Test
    @Timeout(5)
    public void testTimeOut()throws InterruptedException
    {
        Thread.sleep(5000);
        System.out.println("Passed With In Time");
    }
    
    @Test
    @Disabled
    public void testDisablingTest()
    {
        int actualResult = testMavenTdd3.add(1, 2);
        assertEquals(3, actualResult);
    }
    
}
