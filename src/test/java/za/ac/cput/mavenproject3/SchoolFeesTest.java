/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenproject3;

import static java.time.Duration.ofMinutes;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Mpho Sefoloko
 * 218336322
 */
public class SchoolFeesTest {
    
   private SchoolFees learner1;
   private SchoolFees learner2;
   private SchoolFees learner3;
   private SchoolFees learner4;
  
    @Before
    public void setUp() {
        learner1 = new SchoolFees();
        learner2 = new SchoolFees();
        learner3 = learner1;
        learner4 = learner2;
        
    }
    //Tests identity
    @Test
    public void testIdentity(){
        assertSame(learner1, learner3);
        assertSame(learner2, learner4);
    }
    
    //Tests Equality
    @Test
    public void testEquality(){
        assertEquals(learner1, learner3);
        assertEquals(learner2, learner4);
    }
    //Failing test
    @Test
    public void failingTest(){
        fail("A failing test");
        
    }
    //Timeout
    @Test 
    public void timeouTest1() throws InterruptedException{
       TimeUnit.SECONDS.sleep(10);
     }
    @Test
    public void timeoutTest2(){
        
    }
    //Diabaling test
    @Test
    @Disabled
    public void testWillBeSkipped (){
        System.setProperty("ADP2", "ADP3");
        Assumptions.assumeFalse("CNF" .equals(System.getProperty("ADP2")));
    }
    
    @After
    public void tearDown() {
    }

}