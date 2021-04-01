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
    
    @Test //Calling the method to be tested
    public void testEquality()
    {
        assertTrue(test1.equals(test1)); //Verify 
    }
   
    @Test //Calling the method to be tested
    public void testIdentity() 
    {
        assertSame(test1, test1); //Verify (test for identity)
    }
    
    @Test //Calling the method to be tested
    public void testFailingTest()
    {
        assertNotSame(tes1, test2); //Verify
        fail("Failed test deliberately");
    }    
  
    @Test //Calling the method to be tested
    @Timeout(5)
    public void testTimeOut()throws InterruptedException
    {
        Thread.sleep(5000);
        System.out.println("Passed With In Time");
    }
    
    @Test //Calling the method to be tested
    @Disabled
    public void testDisablingTest()
    {
        int actualResult = testMavenTdd3.add(1, 2);
        assertEquals(3, actualResult); //Verify
    }
    
}
