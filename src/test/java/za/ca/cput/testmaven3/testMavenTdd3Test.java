/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ca.cput.testmaven3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * testMavenTdd3Test.java
 * @author Nkukwana Siphamandla 217046177
 * Due date: 01 April 2021
 */
public class testMavenTdd3Test {
    private testMavenTdd3 tMaventdd3;
    
    public testMavenTdd3Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        this.tMaventdd3 = new testMavenTdd3();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class testMavenTdd3.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        testMavenTdd3.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testObjectEquality(){
        
    }
    public void testObjectIdentity(){
        
    }
    public void testFailingTest(){
        
    }
    public void testTimeouts(){
        
    }
    public void testDisablingTest(){
        
    }
}
