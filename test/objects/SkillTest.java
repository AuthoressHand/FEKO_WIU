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
 * @dateCreated 3/12/2017
 * Tests all of the methods in the Skill class.
 */
public class SkillTest {
    
    private Skill skill;
    
    public SkillTest() {
    }
    
    @Before
    public void setUp() {
        skill = new Skill(Stat.Attack, 2, "Test Stat", 100, "This is a test.");
    }
    
    /**
     * Test of getName method, of class Skill.
     */
    @Test
    public void testGetName() {
        assertEquals("Test Stat", skill.getName());
    }

    /**
     * Test of getSPCost method, of class Skill.
     */
    @Test
    public void testGetSPCost() {
        assertEquals(100, skill.getSPCost());
    }

    /**
     * Test of getDescription method, of class Skill.
     */
    @Test
    public void testGetDescription() {
        assertEquals("This is a test.", skill.getDescription());
    }
    
    //Test the getEffect method of class Effect which Skill takes from.
    @Test
    public void testGetEffect() {
        assertEquals(2, skill.getEffect());
    }
    
    //Test the getStat method of class Effect which Skill takes from.
    @Test
    public void testGetStat() {
        assertEquals(Stat.Attack, skill.getStat());
    }
    
}
