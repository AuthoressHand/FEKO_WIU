/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import common.DamageType;
import common.WeaponType;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin
 */
public class JustinAllyCharTest {
    Weapon weapon = new Weapon(null, 0, "Test Weapon", 100, "This is a test.", WeaponType.Axe, 3, 1, DamageType.Physical);
    AllyChar allyChar = new AllyChar("Soleil", 1, 1, weapon);

    /**
     * Test of getExperience method, of class AllyChar.
     */
    @Test
    public void testGetExperience() {
        AllyChar instance = allyChar;
        assertEquals(0, instance.getExperience());
        
        instance.gainExperience(77);
        assertEquals(77, instance.getExperience());
    }

    /**
     * Test of gainExperience method, of class AllyChar.
     */
    @Test
    public void testGainExperience() {
        AllyChar instance = allyChar;
        instance.gainExperience(33);
        assertEquals(33, instance.getExperience());
    }
    
    /**
     * Test of gainExperience method, of class AllyChar.
     */
    @Test
    public void testLevelUp() {
        AllyChar instance = allyChar;
        instance.gainExperience(100);
        assertEquals(0, instance.getExperience());
    }
}
