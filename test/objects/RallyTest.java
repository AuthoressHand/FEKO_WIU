/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import common.Stat;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated 3/13/2018
 * Tests all of the methods in the Rally class.
 */
public class RallyTest {
    
    private Rally rally;
    
    public RallyTest() {
    }
    
    @Before
    public void setUp() {
        rally = new Rally(Stat.Attack, 2, "Test Rally", 100, "This is a test.", 1);
    }
    
    /**
     * Test of getName method, of class Skill from which Rally takes from.
     */
    @Test
    public void testGetName() {
        assertEquals("Test Rally", rally.getName());
    }

    /**
     * Test of getSPCost method, of class Skill from which Rally takes from.
     */
    @Test
    public void testGetSPCost() {
        assertEquals(100, rally.getSPCost());
    }

    /**
     * Test of getDescription method, of class Skill from which Rally takes from.
     */
    @Test
    public void testGetDescription() {
        assertEquals("This is a test.", rally.getDescription());
    }
    
    //Test the getEffect method of class Effect which Skill takes from which Rally takes from.
    @Test
    public void testGetEffect() {
        assertEquals(2, rally.getEffect());
    }
    
    //Test the getStat method of class Effect which Skill takes from which Rally takes from.
    @Test
    public void testGetStat() {
        assertEquals(Stat.Attack, rally.getStat());
    }
    
    //Test the getRange method of the Rally class.
    @Test
    public void testGetRange() {
        assertEquals(1, rally.getRange());
    }
}
