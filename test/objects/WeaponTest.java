/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import common.DamageType;
import common.Stat;
import common.WeaponType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated 3/14/2018
 * Tests all of the methods in the Weapon class.
 */
public class WeaponTest {
    
    private Weapon weapon;
    
    public WeaponTest() {
    }
    
    @Before
    public void setUp() {
        weapon = new Weapon(null, 0, "Test Weapon", 100, "This is a test.", WeaponType.Axe, 3, 1, DamageType.Physical);
    }
    
    //Test of getName method, of class Skill where Weapon comes from.
    @Test
    public void testGetName() {
        assertEquals("Test Weapon", weapon.getName());
    }
    
    //Test of getSpCost of class Skill where Weapon comes from.
    @Test
    public void testGetSPCost() {
        assertEquals(100, weapon.getSPCost());
    }
    
    //Test of getDescription of class Skill where Weapon comes from.
    @Test
    public void testGetDescription() {
        assertEquals("This is a test.", weapon.getDescription());
    }
    
    //Test of getStat of class Effect where Skill comes from where Weapon comes from. This one tests if the stat returned is null.
    @Test
    public void testGetStat_Null() {
        assertEquals(null, weapon.getStat());
    }
    
    //Test of getStat of class Effect where Skill comes from where Weapon comes from. This one tests if the stat returned is not null.
    @Test
    public void testGetStat_NotNull() {
        Weapon weapon2 = new Weapon(Stat.Defense, 0, "Test Weapon", 100, "This is a test.", WeaponType.Axe, 3, 1, DamageType.Physical);
        assertEquals(Stat.Defense, weapon2.getStat());
    }
    
    //Test of getEffect of class Effect where Skill comes from where Weapon comes from.
    @Test
    public void testGetEffect() {
        assertEquals(0, weapon.getEffect());
    }
    
    //Test of getType of class Weapon.
    @Test
    public void testGetType() {
        assertEquals(WeaponType.Axe, weapon.getType());
    }
    
    //Test of getDmg of class Weapon.
    @Test
    public void testGetDmg() {
        assertEquals(3, weapon.getDmg());
    }
    
    //Test of checkRange of class Weapon.
    @Test
    public void testCheckRange() {
        assertEquals(1, weapon.checkRange());
    }
    
    //Test of getDmgType of class Weapon.
    @Test
    public void testGetDmgType() {
        assertEquals(DamageType.Physical, weapon.getDmgType());
    }
}
