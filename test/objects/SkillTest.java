/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rms130
 */
public class SkillTest {
    
    public SkillTest() {
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
     * Test of getName method, of class Skill.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Skill instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSPCost method, of class Skill.
     */
    @Test
    public void testGetSPCost() {
        System.out.println("getSPCost");
        Skill instance = null;
        int expResult = 0;
        int result = instance.getSPCost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Skill.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Skill instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetEffect() {
        System.out.println("getEffect");
    }
    
    @Test
    public void testGetStat() {
        System.out.println("getStat");
    }
    
}
