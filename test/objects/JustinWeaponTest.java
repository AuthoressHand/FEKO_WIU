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
public class JustinWeaponTest {
   
    Weapon weapon = new Weapon(null, 0, "Test Weapon", 100, "This is a test.", WeaponType.Axe, 3, 1, DamageType.Physical);
    
    /**
     * Test of checkRange method, of class Weapon.
     */
    @Test
    public void testCheckRange() {
        Weapon instance1 = weapon;
        assertEquals(1, instance1.checkRange());
        
        Weapon instance2 = new Weapon(null, 0, "Test Weapon", 100, "This is a test.", WeaponType.Axe, 3, 5, DamageType.Physical);
        assertEquals(5, instance2.checkRange());
        
        Weapon instance3 = new Weapon(null, 0, "Test Weapon", 100, "This is a test.", WeaponType.Axe, 3, -1, DamageType.Physical);
        assertEquals(-1, instance3.checkRange());
    }

    /**
     * Test of getDmgType method, of class Weapon.
     */
    @Test
    public void testGetDmgType() {
        Weapon instance1 = weapon;
        assertEquals(DamageType.Physical, instance1.getDmgType());
        
        Weapon instance2 = new Weapon(null, 0, "Test Weapon", 100, "This is a test.", WeaponType.Axe, 3, 5, DamageType.Magical);
        assertEquals(DamageType.Magical, instance2.getDmgType());
    }

    /**
     * Test of getDmg method, of class Weapon.
     */
    @Test
    public void testGetDmg() {
        Weapon instance1 = weapon;
        assertEquals(3, instance1.getDmg());
        
        Weapon instance2 = new Weapon(null, 0, "Test Weapon", 100, "This is a test.", WeaponType.Axe, 53, 5, DamageType.Physical);
        assertEquals(53, instance2.getDmg());
        
        Weapon instance3 = new Weapon(null, 0, "Test Weapon", 100, "This is a test.", WeaponType.Axe, -24, -1, DamageType.Physical);
        assertEquals(-24, instance3.getDmg());
    }

    /**
     * Test of getType method, of class Weapon.
     */
    @Test
    public void testGetType() {
        Weapon instance1 = weapon;
        assertEquals(WeaponType.Axe, instance1.getType());
        
        Weapon instance2 = new Weapon(null, 0, "Test Weapon", 100, "This is a test.", WeaponType.Sword, 53, 5, DamageType.Physical);
        assertEquals(WeaponType.Sword, instance2.getType());
        
        Weapon instance3 = new Weapon(null, 0, "Test Weapon", 100, "This is a test.", WeaponType.Rod, -24, -1, DamageType.Physical);
        assertEquals(WeaponType.Rod, instance3.getType());
    }
    
}
