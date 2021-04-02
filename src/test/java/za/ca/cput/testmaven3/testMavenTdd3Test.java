/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ca.cput.testmaven3;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Sibusiso Makaula 
 * 217101887
 */
public class testMavenTdd3Test {

    public testMavenTdd3Test() {
    }
    private testMavenTdd3 test1;
    private testMavenTdd3 test2;

    @BeforeEach
    public void setUp() throws Exception {
        test1 = new testMavenTdd3();
        test2 = new testMavenTdd3();
    }

    @Test
    public void testEquality() {
        assertTrue(test1.equals(test1));
    }

    @Test
    public void testIdentity() {
        assertTrue(test1.equals(test2));
    }

    @Test
    public void testFailing() {
        assertSame(test1, test1);
        fail("failed test deliberatetly");
    }

    @Test
    @Timeout(1000)
    public void testTimeOut() throws Exception {
        Thread.sleep(1000);
        System.out.println("test passed with in the time");

    }

    @Test
    @Disabled("disable")
    public void testDisabled() {
        assertEquals(3, 1+2);
    }
}
