/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import common.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated 3/25/2018
 * Tests all of the methods in the Party class.
 */
public class PartyTest {
    
    AllyChar ally1;
    AllyChar ally2;
    AllyChar ally3;
    AllyChar ally4;
    AllyChar ally5;
    
    Party allyParty;
    
    public PartyTest() {
    }
    
    @Before
    public void setUp() {
        //ally party
        Weapon weapon = new Weapon(null, 0, "Test Weapon", 100, "This is a test.", WeaponType.Axe, 3, 1, DamageType.Physical);
        Skill[] skillList = new Skill[3];
        Rally rally = new Rally(Stat.Attack, 2, "Test Rally", 100, "This is a test.", 1);
        //charImage = new ImageIcon(getClass().getResource("../../src/img/characters/anna.png"));
        ImageIcon charImage = null;
        Skill skill1 = new Skill(Stat.Attack, 2, "Test Stat 1", 100, "This is a test.");
        Skill skill2 = new Skill(Stat.Defense, 2, "Test Stat 2", 100, "This is a test.");
        Skill skill3 = new Skill(Stat.Resistance, 2, "Test Stat 3", 110, "This is a test.");
        Skill skill4 = new Skill(Stat.Speed, 2, "Test Stat 4", 130, "This is a test.");
        skillList[0] = skill1;
        ArrayList<Skill> unlocked = new ArrayList<>();
        unlocked.add(weapon);
        unlocked.add(rally);
        unlocked.add(skill1);
        unlocked.add(skill2);
        ArrayList<Skill> locked = new ArrayList<>();
        locked.add(skill3);
        locked.add(skill4);
        
        ally1 = new AllyChar("Ally 1", 10, weapon, 1, 2, 3, 4, 5, 2, skillList, null, charImage, CharType.Ally, 110, 0, 100, 100, 100, 100, 100, unlocked, locked);
        ally2 = new AllyChar("Ally 2", 10, weapon, 1, 2, 3, 4, 5, 2, skillList, null, charImage, CharType.Main, 110, 0, 100, 100, 100, 100, 100, unlocked, locked);
        ally3 = new AllyChar("Ally 3", 10, weapon, 1, 2, 3, 4, 5, 2, skillList, null, charImage, CharType.Ally, 110, 0, 100, 100, 100, 100, 100, unlocked, locked);
        ally4 = new AllyChar("Ally 4", 10, weapon, 1, 2, 3, 4, 5, 2, skillList, null, charImage, CharType.Ally, 110, 0, 100, 100, 100, 100, 100, unlocked, locked);
        ally5 = new AllyChar("Ally 5", 10, weapon, 1, 2, 3, 4, 5, 2, skillList, null, charImage, CharType.Ally, 110, 0, 100, 100, 100, 100, 100, unlocked, locked);
                
        ArrayList<Character> charList = new ArrayList<>();
        charList.add(ally1);
        charList.add(ally2);
        charList.add(ally3);
        charList.add(ally4);
        //charList.add(ally5);
        
        Character[] partyList = new Character[4];
        partyList[0] = ally1;
        partyList[1] = ally2;
        partyList[2] = ally3;
        
        allyParty = new Party(charList, partyList);
    }

    //Tests getPartySize method in Party class.
    @Test
    public void testGetPartySize() {
        assertEquals(4, allyParty.getPartySize());
    }
    
    //Tests addToParty method in Party class.
    @Test
    public void testAddToParty_0() {
        /*enemyParty.addToParty(enemy, 0);
        assertEquals("Test", enemyParty.getPartyChar(0).getName());*/
        allyParty.addToParty(ally5, 0);
        assertEquals(ally5.getName(), allyParty.getPartyChar(0).getName());
    }
    
    @Test
    public void testAddToParty_1() {
        allyParty.addToParty(ally5, 1);
        assertEquals(ally5.getName(), allyParty.getPartyChar(1).getName());
    }
    
    @Test
    public void testAddToParty_2() {
        allyParty.addToParty(ally5, 2);
        assertEquals(ally5.getName(), allyParty.getPartyChar(2).getName());
    }
    
    @Test
    public void testAddToParty_3() {
        allyParty.addToParty(ally5, 3);
        assertEquals(ally5.getName(), allyParty.getPartyChar(3).getName());
    }
    
    @Test
    public void testAddToParty_Fail() {
        allyParty.addToParty(ally5, 4);
        assertEquals(null, allyParty.getPartyChar(4));
    }
    
    @Test
    public void testAddToParty_AlreadyIn() {
        allyParty.addToParty(ally1, 3);
        assertEquals(ally1.getName(), allyParty.getPartyChar(0).getName());
        assertEquals(null, allyParty.getPartyChar(3));
    }
    
    //Tests addToArmy method in Party class.
    @Test
    public void testAddToArmy_New() {
        allyParty.addToArmy(ally5);
        assertEquals(ally5.getName(), allyParty.getArmyChar(ally5.getName()).getName());
    }
    
    @Test
    public void testAddToArmy_Old() {
        allyParty.addToArmy(ally4);
        assertEquals(ally4.getName(), allyParty.getArmyChar(ally4.getName()).getName());
    }
    
    //Tests removeFromParty method in Party class.
    @Test
    public void testRemoveFromParty_0() {
        allyParty.removeFromParty(0);
        assertNull(allyParty.getPartyChar(0));
    }
    
    @Test
    public void testRemoveFromParty_Fail() {
        allyParty.removeFromParty(4);
        assertNull(allyParty.getPartyChar(4));
    }
    
    @Test
    public void testRemoveFromParty_All() {
        for (int i = 0; i < allyParty.getPartySize(); i++) {
            allyParty.removeFromParty(i);
            assertNull(allyParty.getPartyChar(i));
        }
    }
    
    //Tests getArmyChar from Party class.
    @Test
    public void testGetArmyChar_NoSuccess() {
        AllyChar ally = (AllyChar) allyParty.getArmyChar(0);
        assertEquals(ally, ally1);
    }
    
    @Test
    public void testGetArmyChar_NoFail() {
        AllyChar getEnemy = (AllyChar) allyParty.getArmyChar(5);
        assertNull(getEnemy);
    }
    
    @Test
    public void testGetArmyChar_NameSuccess() {
        AllyChar ally = (AllyChar) allyParty.getArmyChar("Ally 1");
        assertEquals(ally, ally1);
    }
    
    @Test
    public void testGetArmyChar_NameFail() {
        AllyChar getEnemy = (AllyChar) allyParty.getArmyChar("Enemy");
        assertNull(getEnemy);
    }
    
    //Tests getPartyChar method from Party class.
    @Test
    public void testGetPartyChar_Success() {
        AllyChar ally = (AllyChar) allyParty.getPartyChar(0);
        assertEquals(ally, ally1);
    }
    
    @Test
    public void testGetPartyChar_Fail() {
        AllyChar getEnemy = (AllyChar) allyParty.getPartyChar(5);
        assertNull(getEnemy);
    }
    
    @Test
    public void testGetPartyChar_Null() {
        AllyChar ally = (AllyChar) allyParty.getPartyChar(3);
        assertNull(ally);
    }
    
    //Tests getParty method from Party class.
    @Test
    public void testGetParty() {
        Character[] characters = allyParty.getParty();
        assertEquals(characters[0], ally1);
    }
    
    //Tests getArmy method from Party class.
    @Test
    public void testGetArmy() {
        ArrayList<Character> characters = allyParty.getArmy();
        assertEquals(characters.get(0), ally1);
    }
}
