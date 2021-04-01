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
 * @Author Aphiwe Skeyi
 * Student no: 217157785
 */
public class StudentTest {
    
   private Student firstStudent;
   private Student secondStudent;
   private Student thirdStudent;
   private Student fourthStudent;
  
    @Before
    public void setUp() {
        firstStudent = new Student();
        secondStudent = new Student();
        thirdStudent = firstStudent;
        fourthStudent = secondStudent;
        
    }
    
    @Test
    public void testIdentity(){
        assertSame(firstStudent, learner3);
        assertSame(secondStudent, fourthStudent);
    }
    
    //Tests Equality
    @Test
    public void testEquality(){
        assertEquals(firstStudent, learner3);
        assertEquals(secondStudent, fourthStudent);
    }
    
    @Test
    public void failingTest(){
        fail("A failing test");
        
    }
    
    @Test 
    public void timeouTest1() throws InterruptedException{
       TimeUnit.SECONDS.sleep(10);
     }
    @Test
    public void timeoutTest2(){
        
    }
     
    @Test
    @Disabled
    public void testWillBeSkipped (){
        System.setProperty("Aphiwe", "Skeyi");
        Assumptions.assumeFalse("Aphiwe" .equals(System.getProperty("Nomonde")));
    }
    
    @After
    public void tearDown() {
    }

    

}