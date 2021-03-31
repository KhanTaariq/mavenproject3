/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ca.cput.testmaven3;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Taariq
 */
public class testMavenTdd3Test
{
    private testMavenTdd3 tmt1;
    private testMavenTdd3 tmt2;
    
    @BeforeEach
    public void setUp()
    {
        tmt1 = new testMavenTdd3();
        tmt2 = new testMavenTdd3();
    }
    
    @Test
    public void testEquality()
    {
        assertTrue(tmt1.equals(tmt1));
    }
   
    @Test
    public void testIdentity()
    {
        assertSame(tmt1, tmt1);
    }
    
    @Test
    public void testFailingTest()
    {
        assertNotSame(tmt1, tmt2);
        fail("Failed test deliberately");
    }    
  
    @Test
    @Timeout(5)
    public void testTimeOut()throws InterruptedException
    {
        Thread.sleep(5000);
        System.out.println("Test passed with in the time");
    }
    
    @Test
    @Disabled
    public void testDisablingTest()
    {
        int actualResult = testMavenTdd3.add(1, 2);
        assertEquals(3, actualResult);
    }
    
}
