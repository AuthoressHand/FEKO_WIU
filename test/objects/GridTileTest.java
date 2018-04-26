/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import common.DamageType;
import common.WeaponType;
import javax.swing.JButton;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin
 */
public class GridTileTest {

    Weapon weapon = new Weapon(null, 0, "Test Weapon", 100, "This is a test.", WeaponType.Axe, 3, 1, DamageType.Physical);
    AllyChar allyChar = new AllyChar("Soleil", 1, 1, weapon);
    
    JButton jb = new JButton("hi");
    GridTile gt = new GridTile(jb, true);
    
    /**
     * Test of getTile method, of class GridTile.
     */
    @Test
    public void testGetTile() {
        GridTile instance = gt;
        assertEquals(instance.getTile(), jb);
    }

    /**
     * Test of isAccessible method, of class GridTile.
     */
    @Test
    public void testIsAccessible() {
        GridTile instance1 = gt;
        assertEquals(true, instance1.isAccessible());
        
        GridTile instance2 = new GridTile(jb, false);
        assertEquals(false, instance2.isAccessible());
    }

    /**
     * Test of isOccupied method, of class GridTile.
     */
    @Test
    public void testIsOccupied() {
        GridTile instance1 = gt;
        assertEquals(false, instance1.isOccupied());
        
        instance1.addCharacter(allyChar, new Party());
        assertEquals(true, instance1.isOccupied());
        
        instance1.removeCharacter();
        assertEquals(false, instance1.isOccupied());
    }

    /**
     * Test of getDistance method, of class GridTile.
     */
    @Test
    public void testGetDistance() {
        GridTile instance1 = gt;
        assertEquals(100, instance1.getDistance());
        
        instance1.setDistance(20);
        assertEquals(20, instance1.getDistance());
    }

    /**
     * Test of setDistance method, of class GridTile.
     */
    @Test
    public void testSetDistance() {
        GridTile instance1 = gt;
        assertEquals(100, instance1.getDistance());
        
        instance1.setDistance(40);
        assertEquals(40, instance1.getDistance());
    }

    /**
     * Test of removeCharacter method, of class GridTile.
     */
    @Test
    public void testRemoveCharacter() {
        GridTile instance1 = gt;
        assertEquals(false, instance1.isOccupied());
        
        instance1.addCharacter(allyChar, new Party());
        assertEquals(true, instance1.isOccupied());
        
        instance1.removeCharacter();
        assertEquals(false, instance1.isOccupied());
    }

    /**
     * Test of getParty method, of class GridTile.
     */
    @Test
    public void testGetParty() {
        GridTile instance1 = gt;
        assertEquals(false, instance1.isOccupied());
        
        Party p = new Party();
        
        instance1.addCharacter(allyChar, p);
        assertEquals(true, instance1.isOccupied());
        
        assertEquals(p, instance1.getParty());
    }

    /**
     * Test of addCharacter method, of class GridTile.
     */
    @Test
    public void testAddCharacter() {
        GridTile instance1 = gt;
        assertEquals(false, instance1.isOccupied());
        
        instance1.addCharacter(allyChar, new Party());
        assertEquals(true, instance1.isOccupied());
    }

    /**
     * Test of getCharacter method, of class GridTile.
     */
    @Test
    public void testGetCharacter() {
        GridTile instance1 = gt;
        assertEquals(false, instance1.isOccupied());
        
        instance1.addCharacter(allyChar, new Party());
        assertEquals(allyChar, instance1.getCharacter());
    }
    
}
