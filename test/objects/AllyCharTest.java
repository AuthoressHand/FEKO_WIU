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
 * @dateCreated 3/22/2018
 * Tests all of the methods in the AllyChar class.
 */
public class AllyCharTest {
    private Weapon weapon;
    private Skill[] skillList;
    private Rally rally;
    private ImageIcon charImage;
    Skill skill1;
    Skill skill2;
    Skill skill3;
    Skill skill4;
    private ArrayList<Skill> unlocked;
    private ArrayList<Skill> locked;
    private AllyChar ally;
    
    
    public AllyCharTest() {
    }
    
    @Before
    public void setUp() {
        //needed to create a character
        weapon = new Weapon(null, 0, "Test Weapon", 100, "This is a test.", WeaponType.Axe, 3, 1, DamageType.Physical);
        skillList = new Skill[3];
        rally = new Rally(Stat.Attack, 2, "Test Rally", 100, "This is a test.", 1);
        //charImage = new ImageIcon(getClass().getResource("../../src/img/characters/anna.png"));
        charImage = null;
        skill1 = new Skill(Stat.Attack, 2, "Test Stat 1", 100, "This is a test.");
        skill2 = new Skill(Stat.Defense, 2, "Test Stat 2", 100, "This is a test.");
        skill3 = new Skill(Stat.Resistance, 2, "Test Stat 3", 110, "This is a test.");
        skill4 = new Skill(Stat.Speed, 2, "Test Stat 4", 130, "This is a test.");
        skillList[0] = skill1;
        unlocked = new ArrayList<>();
        unlocked.add(weapon);
        unlocked.add(rally);
        unlocked.add(skill1);
        unlocked.add(skill2);
        locked = new ArrayList<>();
        locked.add(skill3);
        locked.add(skill4);
        ally = new AllyChar("Test", 10, weapon, 1, 2, 3, 4, 5, 2, skillList, null, charImage, CharType.Ally, 110, 0, 100, 100, 100, 100, 100, unlocked, locked);
    }
    
    //Tests getName of class Character which AllyChar comes from.
    @Test
    public void testGetName() {
        assertEquals("Test", ally.getName());
    }
    
    //Tests getMaxHP of class Character which AllyChar comes from.
    @Test
    public void testGetMaxHP() {
        assertEquals(10, ally.getMaxHP());
    }
    
    //Tests getCurrentHP of class Character which AllyChar comes from.
    @Test
    public void testGetCurrentHP() {
        assertEquals(10, ally.getCurrentHP());
    }
    
    //Tests getWeapon of class Character which AllyChar comes from.
    @Test
    public void testGetWeapon() {
        assertEquals("Test Weapon", ally.getWeapon().getName());
    }
    
    //Tests getLevel of class Character which AllyChar comes from.
    @Test
    public void testGetLevel() {
        assertEquals(1, ally.getLevel());
    }
    
    //Tests getTotalAtk of class Character which AllyChar comes from.  
    @Test
    public void testGetTotalAtk() {
        assertEquals(5, ally.getTotalAtk());
    }
    
    //Tests getTotalDef of class Character which AllyChar comes from.    
    @Test
    public void testGetTotalDef() {
        assertEquals(3, ally.getTotalDef());
    }
    
    //Tests getTotalRes of class Character which AllyChar comes from.    
    @Test
    public void testGetTotalRes() {
        assertEquals(4, ally.getTotalRes());
    }
    
    //Tests getTotalSpd of class Character which AllyChar comes from.
    @Test
    public void testGetTotalSpd() {
        assertEquals(5, ally.getTotalSpd());
    }
    
    //Tests getWalkRange of class Character which AllyChar comes from.
    @Test
    public void testGetWalkRange() {
        assertEquals(2, ally.getWalkRange());
    }
    
    //Tests getSkill of class Character which AllyChar comes from.
    @Test
    public void testGetSkill_0() {
        assertEquals("Test Stat 1", ally.getSkill(0).getName());
    }
    
    //Tests getSkill of class Character which AllyChar comes from.
    @Test
    public void testGetSkill_1() {
        assertEquals("", ally.getSkill(1).getName());
    }
    
    //Tests getSkill of class Character which AllyChar comes from.
    @Test
    public void testGetSkill_2() {
        ally.setSkill(null, 2);
        assertEquals("", ally.getSkill(2).getName());
    }
    
    //Tests getName of class Character which AllyChar comes from.
    @Test
    public void testGetSkill_OutOfBounds() {
        assertEquals(null, ally.getSkill(3));
    }
    
    //Tests getRally of class Character which AllyChar comes from.
    @Test
    public void testGetRally() {
        assertEquals(null, ally.getRally());
    }
    
    //Tests getCharImg of class Character which AllyChar comes from.
    @Test
    public void testGetCharImg() {
        assertEquals(charImage, ally.getCharImg());
    }
    
    //Tests getActive of class Character which AllyChar comes from.
    @Test
    public void testGetActive() {
        assertTrue(ally.getActive());
    }
    
    //Tests getCharType of class Character which AllyChar comes from.
    @Test
    public void testGetCharType(){
        assertEquals(CharType.Ally, ally.getCharType());
    }
    
    //Tests reactivate of class Character which AllyChar comes from.
    @Test
    public void testReactivate() {
        ally.deactivate();
        ally.reactivate();
        assertTrue(ally.getActive());
    }
    
    //Tests deactivate of class Character which AllyChar comes from.
    @Test
    public void testDeactivate() {
        ally.deactivate();
        assertFalse(ally.getActive());
    }
    
    //Tests changeHP of class Character which AllyChar comes from.
    @Test
    public void testChangeHP_Sub() {
        ally.changeHP(3);
        assertEquals(7, ally.getCurrentHP());
    }
    
    //Tests changeHP of class Character which AllyChar comes from.
    @Test
    public void testChangeHP_Add() {
        ally.changeHP(1);
        ally.changeHP(-1);
        assertEquals(10, ally.getCurrentHP());
    }
    
    //Tests changeHP of class Character which AllyChar comes from.
    @Test
    public void testChangeHP_SubBelow0() {
        ally.changeHP(11);
        assertEquals(-1, ally.getCurrentHP());
    }
    
    //Tests changeHP of class Character which AllyChar comes from.
    @Test
    public void testChangeHP_AddAboveMax() {
        ally.changeHP(-2);
        assertEquals(10, ally.getCurrentHP());
    }
    
    //Tests boostAtk of class Character which AllyChar comes from.
    @Test
    public void testBoostAtk_Pos() {
        ally.boostAtk(2);
        assertEquals(7, ally.getTotalAtk());
    }
    
    @Test
    public void testBoostAtk_Neg() {
        ally.boostAtk(-2);
        assertEquals(3, ally.getTotalAtk());
    }
    
    //Tests boostDef of class Character which AllyChar comes from.
    @Test
    public void testBoostDef_Pos() {
        ally.boostDef(2);
        assertEquals(5, ally.getTotalDef());
    }
    
    @Test
    public void testBoostDef_Neg() {
        ally.boostDef(-2);
        assertEquals(1, ally.getTotalDef());
    }
    
    //Tests boostRes of class Character which AllyChar comes from.
    @Test
    public void testBoostRes_Pos() {
        ally.boostRes(2);
        assertEquals(6, ally.getTotalRes());
    }
    
    @Test
    public void testBoostRes_Neg() {
        ally.boostRes(-2);
        assertEquals(2, ally.getTotalRes());
    }
    
    //Tests boostSpd of class Character which AllyChar comes from.
    @Test
    public void testBoostSpd_Pos() {
        ally.boostSpd(2);
        assertEquals(7, ally.getTotalSpd());
    }
    
    @Test
    public void testBoostSpd_Neg() {
        ally.boostSpd(-2);
        assertEquals(3, ally.getTotalSpd());
    }
    
    //Tests setSkill of class Character which AllyChar comes from.
    @Test
    public void testSetSkill_0() {
        Skill skill = new Skill(Stat.Attack, 2, "Test Stat", 100, "This is a test.");
        ally.setSkill(skill, 0);
        assertEquals("Test Stat", ally.getSkill(0).getName());
    }
    
    //Tests setSkill of class Character which AllyChar comes from.
    @Test
    public void testSetSkill_1() {
        Skill skill = new Skill(Stat.Attack, 2, "Test Stat", 100, "This is a test.");
        ally.setSkill(skill, 1);
        assertEquals("Test Stat", ally.getSkill(1).getName());
    }
    
    //Tests setSkill of class Character which AllyChar comes from.
    @Test
    public void testSetSkill_2() {
        Skill skill = new Skill(Stat.Attack, 2, "Test Stat", 100, "This is a test.");
        ally.setSkill(skill, 2);
        assertEquals("Test Stat", ally.getSkill(2).getName());
    }
    
    //Tests setSkill of class Character which AllyChar comes from.
    @Test
    public void testSetSkill_Fail() {
        Skill skill = new Skill(Stat.Attack, 2, "Test Stat", 100, "This is a test.");
        ally.setSkill(skill, 3);
        assertEquals(null, ally.getSkill(3));
    }
    
    //Tests setWeapon of class Character which AllyChar comes from.
    @Test
    public void testSetWeapon_NoBoost() {
        Weapon newWeapon = new Weapon(null, 0, "Test Weapon 2", 100, "This is a test.", WeaponType.Axe, 2, 1, DamageType.Physical);
        ally.setWeapon(newWeapon);
        assertEquals("Test Weapon 2", ally.getWeapon().getName());
        assertEquals(4, ally.getTotalAtk());
    }
    
    @Test
    public void testSetWeapon_WithBoost() {
        Weapon newWeapon = new Weapon(Stat.Attack, 1, "Test Weapon 2", 100, "This is a test.", WeaponType.Axe, 3, 1, DamageType.Physical);
        ally.setWeapon(newWeapon);
        assertEquals("Test Weapon 2", ally.getWeapon().getName());
        assertEquals(6, ally.getTotalAtk());
    }
    
    //Tests setRally of class Character which AllyChar comes from.
    @Test
    public void testSetRally() {
        Rally newRally = new Rally(Stat.Attack, 2, "Test Rally 2", 100, "This is a test.", 1);
        ally.setRally(newRally);
        assertEquals("Test Rally 2", ally.getRally().getName());
    }
    
    //Tests equipRally of class Character which AllyChar comes from.
    @Test
    public void testEquipRally() {
        Rally newRally = new Rally(Stat.Attack, 2, "Test Rally 2", 100, "This is a test.", 1);
        ally.equipRally(newRally);
        assertEquals("Test Rally 2", ally.getRally().getName());
    }
    
    //Tests increasedLevel of class Character which AllyChar comes from.
    @Test
    public void testIncreasedLevel() {
        ally.increaseLevel();
        assertEquals(2, ally.getLevel());
    }
    
    //Tests givePermBoost of class Character which AllyChar comes from.
    @Test
    public void testGivePermBoost_HP() {
        ally.givePermBoost(Stat.HP, 1);
        assertEquals(11, ally.getMaxHP());
        assertEquals(5, ally.getTotalAtk());
    }
    
    //Tests givePermBoost of class Character which AllyChar comes from.
    @Test
    public void testGivePermBoost_Atk() {
        ally.givePermBoost(Stat.Attack, 1);
        assertEquals(6, ally.getTotalAtk());
        assertEquals(3, ally.getTotalDef());
    }
    
    //Tests givePermBoost of class Character which AllyChar comes from.
    @Test
    public void testGivePermBoost_Def() {
        ally.givePermBoost(Stat.Defense, 1);
        assertEquals(4, ally.getTotalDef());
        assertEquals(4, ally.getTotalRes());
    }
    
    //Tests givePermBoost of class Character which AllyChar comes from.
    @Test
    public void testGivePermBoost_Res() {
        ally.givePermBoost(Stat.Resistance, 1);
        assertEquals(5, ally.getTotalRes());
        assertEquals(5, ally.getTotalSpd());
    }
    
    //Tests givePermBoost of class Character which AllyChar comes from.
    @Test
    public void testGivePermBoost_Spd() {
        ally.givePermBoost(Stat.Speed, 1);
        assertEquals(6, ally.getTotalSpd());
    }
    
    //Tests givePermBoost of class Character which AllyChar comes from.
    @Test
    public void testGivePermBoost_Null() {
        ally.givePermBoost(null, 1);
        assertEquals(10, ally.getMaxHP());
        assertEquals(5, ally.getTotalAtk());
        assertEquals(3, ally.getTotalDef());
        assertEquals(4, ally.getTotalRes());
        assertEquals(5, ally.getTotalSpd());
    }
    
    //Tests givePermBoost of class Character which AllyChar comes from.
    @Test
    public void testGivePermBoost_None() {
        ally.givePermBoost(Stat.EXP, 1);
        assertEquals(10, ally.getMaxHP());
        assertEquals(5, ally.getTotalAtk());
        assertEquals(3, ally.getTotalDef());
        assertEquals(4, ally.getTotalRes());
        assertEquals(5, ally.getTotalSpd());
    }
    
    //Tests equipSkill that is overriden in AllyChar.
    @Test
    public void testEquipSkill_RemoveDefault() {
        Skill skill = new Skill(Stat.Attack, 2, "Test Skill", 100, "This is a test.");
        ally.equipSkill(skill, 1);
        assertEquals("Test Skill", ally.getSkill(1).getName());
        assertEquals(7, ally.getTotalAtk());
    }
    
    @Test
    public void testEquipSkill_NotDefault() {
        Skill skill1 = new Skill(Stat.Attack, 2, "Test Skill 1", 100, "This is a test.");
        Skill skill2 = new Skill(Stat.Defense, 3, "Test Skill 2", 100, "This is a test.");
        ally.equipSkill(skill1, 1);
        ally.equipSkill(skill2, 1);
        assertEquals("Test Skill 2", ally.getSkill(1).getName());
        assertEquals(5, ally.getTotalAtk());
        assertEquals(6, ally.getTotalDef());
    }
    
    //Tests equipWeapon that is overriden in AllyChar.
    @Test
    public void testEquipWeapon_NoBoost() {
        Weapon newWeapon = new Weapon(null, 0, "Test Weapon 2", 100, "This is a test.", WeaponType.Axe, 3, 1, DamageType.Physical);
        ally.equipWeapon(newWeapon);
        assertEquals("Test Weapon 2", ally.getWeapon().getName());
    }
    
    @Test
    public void testEquipWeapon_Boost() {
        Weapon newWeapon = new Weapon(Stat.Speed, 2, "Test Weapon 2", 100, "This is a test.", WeaponType.Axe, 3, 1, DamageType.Physical);
        ally.equipWeapon(newWeapon);
        assertEquals("Test Weapon 2", ally.getWeapon().getName());
        assertEquals(7, ally.getTotalSpd());
    }
    
    @Test
    public void testEquipWeapon_Remove() {
        Weapon newWeapon = new Weapon(Stat.Speed, 2, "Test Weapon 2", 100, "This is a test.", WeaponType.Axe, 3, 1, DamageType.Physical);
        ally.equipWeapon(newWeapon);
        ally.equipWeapon(weapon);
        assertEquals("Test Weapon", ally.getWeapon().getName());
        assertEquals(5, ally.getTotalSpd());
    }
    
    //Test getSpecialPoints method in AllyChar.
    @Test
    public void testGetSpecialPoints() {
        assertEquals(110, ally.getSpecialPoints());
    }
    
    //Tests getExperience method in AllyChar.
    @Test
    public void testGetExperience() {
        assertEquals(0, ally.getExperience());
    }
    
    //Tests getUnlockedList method in AllyChar.
    @Test
    public void testGetUnlockedList() {
        assertEquals(unlocked, ally.getUnlockedSkills());
    }
    
    //Tests getLockedList method in AllyChar.
    @Test
    public void testGetLockedList() {
        assertEquals(locked, ally.getLockedSkills());
    }
    
    //Tests levelUp method in AllyChar.
    @Test
    public void testLevelUp_All() {
        ally.levelUp();
        assertEquals(2, ally.getLevel());
        assertEquals(11, ally.getMaxHP());
        assertEquals(10, ally.getCurrentHP());
        assertEquals(6, ally.getTotalAtk());
        assertEquals(4, ally.getTotalDef());
        assertEquals(5, ally.getTotalRes());
        assertEquals(6, ally.getTotalSpd());
        assertEquals(122, ally.getSpecialPoints());
        assertEquals(-100, ally.getExperience());
    }
    @Test
    public void testLevelUp_None() {
        AllyChar ally2 = new AllyChar("Test", 10, weapon, 1, 2, 3, 4, 5, 2, skillList, null, charImage, CharType.Ally, 0, 0, 0, 0, 0, 0, 0, unlocked, locked);
        ally2.levelUp();
        assertEquals(2, ally2.getLevel());
        assertEquals(10, ally2.getMaxHP());
        assertEquals(5, ally2.getTotalAtk());
        assertEquals(3, ally2.getTotalDef());
        assertEquals(4, ally2.getTotalRes());
        assertEquals(5, ally2.getTotalSpd());
        assertEquals(12, ally2.getSpecialPoints());
        assertEquals(-100, ally2.getExperience());
    }
    
    //Tests increaseExperience method in AllyChar.
    @Test
    public void testGainExperience_Under100() {
        ally.gainExperience(50);
        assertEquals(50, ally.getExperience());
        assertEquals(1, ally.getLevel());
    }
    
    @Test
    public void testGainExperience_Over100() {
        ally.gainExperience(110);
        assertEquals(10, ally.getExperience());
        assertEquals(2, ally.getLevel());
    }
    
    @Test
    public void testGainExperience_Over200() {
        ally.gainExperience(230);
        assertEquals(30, ally.getExperience());
        assertEquals(3, ally.getLevel());
    }
    
    //Tests purchaseSkill method in AllyChar.
    @Test
    public void testPurchaseSkill_Buy() {
        ally.purchaseSkill(skill3);
        assertTrue(ally.getUnlockedSkills().contains(skill3));
        assertFalse(ally.getLockedSkills().contains(skill3));
        assertEquals(0, ally.getSpecialPoints());
    }
    
    @Test
    public void testPurchaseSkill_TooMuch() {
        ally.purchaseSkill(skill4);
        assertFalse(ally.getUnlockedSkills().contains(skill4));
        assertTrue(ally.getLockedSkills().contains(skill4));
        assertEquals(110, ally.getSpecialPoints());
    }
    
    @Test
    public void testPurchaseSkill_NotExist() {
        Skill skill = new Skill(Stat.Attack, 2, "Test Stat", 100, "This is a test.");
        ally.purchaseSkill(skill);
        assertFalse(ally.getUnlockedSkills().contains(skill));
        assertFalse(ally.getLockedSkills().contains(skill));
        assertEquals(110, ally.getSpecialPoints());
    }
    
    //Tests unequipSkill method from AllyChar class.
    @Test
    public void testUnequipSkill_InArray() {
        ally.unequipSkill(0);
        assertEquals("", ally.getSkill(0).getName());
    }
    
    @Test
    public void testUnequipSkill_Fail() {
        ally.unequipSkill(3);
    }
    
    //Tests unequipRally method from AllyChar class.
    @Test
    public void testUnequipRally() {
        ally.unequipRally();
        assertNull(ally.getRally());
    }
    
    
}
