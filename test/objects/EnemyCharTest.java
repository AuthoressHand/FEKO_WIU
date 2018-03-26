/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import common.*;
import javax.swing.ImageIcon;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated 3/15/2018
 * Tests all of the methods in the EnemyChar class.
 */
public class EnemyCharTest {
    
    private Weapon weapon;
    private Skill[] skillList;
    private Rally rally;
    private ImageIcon charImage;
    private EnemyChar enemy;
    
    
    public EnemyCharTest() {
    }
    
    @Before
    public void setUp() {
        //needed to create a character
        weapon = new Weapon(null, 0, "Test Weapon", 100, "This is a test.", WeaponType.Axe, 3, 1, DamageType.Physical);
        skillList = new Skill[3];
        rally = new Rally(Stat.Attack, 2, "Test Rally", 100, "This is a test.", 1);
        //charImage = new ImageIcon(getClass().getResource("../../src/img/characters/anna.png"));
        charImage = null;
        enemy = new EnemyChar("Test", 10, weapon, 1, 2, 3, 4, 5, 2, skillList, null, charImage, CharType.Enemy, MoveType.Go);
    }
    
    //Tests getName of class Character which EnemyChar comes from.
    @Test
    public void testGetName() {
        assertEquals("Test", enemy.getName());
    }
    
    //Tests getMaxHP of class Character which EnemyChar comes from.
    @Test
    public void testGetMaxHP() {
        assertEquals(10, enemy.getMaxHP());
    }
    
    //Tests getCurrentHP of class Character which EnemyChar comes from.
    @Test
    public void testGetCurrentHP() {
        assertEquals(10, enemy.getCurrentHP());
    }
    
    //Tests getWeapon of class Character which EnemyChar comes from.
    @Test
    public void testGetWeapon() {
        assertEquals("Test Weapon", enemy.getWeapon().getName());
    }
    
    //Tests getLevel of class Character which EnemyChar comes from.
    @Test
    public void testGetLevel() {
        assertEquals(1, enemy.getLevel());
    }
    
    //Tests getTotalAtk of class Character which EnemyChar comes from.  
    @Test
    public void testGetTotalAtk() {
        assertEquals(5, enemy.getTotalAtk());
    }
    
    //Tests getTotalDef of class Character which EnemyChar comes from.    
    @Test
    public void testGetTotalDef() {
        assertEquals(3, enemy.getTotalDef());
    }
    
    //Tests getTotalRes of class Character which EnemyChar comes from.    
    @Test
    public void testGetTotalRes() {
        assertEquals(4, enemy.getTotalRes());
    }
    
    //Tests getTotalSpd of class Character which EnemyChar comes from.
    @Test
    public void testGetTotalSpd() {
        assertEquals(5, enemy.getTotalSpd());
    }
    
    //Tests getWalkRange of class Character which EnemyChar comes from.
    @Test
    public void testGetWalkRange() {
        assertEquals(2, enemy.getWalkRange());
    }
    
    //Tests getSkill of class Character which EnemyChar comes from.
    @Test
    public void testGetSkill_0() {
        assertEquals("", enemy.getSkill(0).getName());
    }
    
    //Tests getSkill of class Character which EnemyChar comes from.
    @Test
    public void testGetSkill_1() {
        assertEquals("", enemy.getSkill(1).getName());
    }
    
    //Tests getSkill of class Character which EnemyChar comes from.
    @Test
    public void testGetSkill_2() {
        assertEquals("", enemy.getSkill(2).getName());
    }
    
    //Tests getName of class Character which EnemyChar comes from.
    @Test
    public void testGetSkill_OutOfBounds() {
        assertEquals(null, enemy.getSkill(3));
    }
    
    //Tests getRally of class Character which EnemyChar comes from.
    @Test
    public void testGetRally() {
        assertEquals(null, enemy.getRally().getName());
    }
    
    //Tests getCharImg of class Character which EnemyChar comes from.
    @Test
    public void testGetCharImg() {
        assertEquals(charImage, enemy.getCharImg());
    }
    
    //Tests getActive of class Character which EnemyChar comes from.
    @Test
    public void testGetActive() {
        assertTrue(enemy.getActive());
    }
    
    //Tests getCharType of class Character which EnemyChar comes from.
    @Test
    public void testGetCharType(){
        assertEquals(CharType.Enemy, enemy.getCharType());
    }
    
    //Tests reactivate of class Character which EnemyChar comes from.
    @Test
    public void testReactivate() {
        enemy.deactivate();
        enemy.reactivate();
        assertTrue(enemy.getActive());
    }
    
    //Tests deactivate of class Character which EnemyChar comes from.
    @Test
    public void testDeactivate() {
        enemy.deactivate();
        assertFalse(enemy.getActive());
    }
    
    //Tests changeHP of class Character which EnemyChar comes from.
    @Test
    public void testChangeHP_Sub() {
        enemy.changeHP(3);
        assertEquals(7, enemy.getCurrentHP());
    }
    
    //Tests changeHP of class Character which EnemyChar comes from.
    @Test
    public void testChangeHP_Add() {
        enemy.changeHP(1);
        enemy.changeHP(-1);
        assertEquals(10, enemy.getCurrentHP());
    }
    
    //Tests changeHP of class Character which EnemyChar comes from.
    @Test
    public void testChangeHP_SubBelow0() {
        enemy.changeHP(11);
        assertEquals(-1, enemy.getCurrentHP());
    }
    
    //Tests changeHP of class Character which EnemyChar comes from.
    @Test
    public void testChangeHP_AddAboveMax() {
        enemy.changeHP(-2);
        assertEquals(10, enemy.getCurrentHP());
    }
    
    //Tests boostAtk of class Character which EnemyChar comes from.
    @Test
    public void testBoostAtk_Pos() {
        enemy.boostAtk(2);
        assertEquals(7, enemy.getTotalAtk());
    }
    
    @Test
    public void testBoostAtk_Neg() {
        enemy.boostAtk(-2);
        assertEquals(3, enemy.getTotalAtk());
    }
    
    //Tests boostDef of class Character which EnemyChar comes from.
    @Test
    public void testBoostDef_Pos() {
        enemy.boostDef(2);
        assertEquals(5, enemy.getTotalDef());
    }
    
    @Test
    public void testBoostDef_Neg() {
        enemy.boostDef(-2);
        assertEquals(1, enemy.getTotalDef());
    }
    
    //Tests boostRes of class Character which EnemyChar comes from.
    @Test
    public void testBoostRes_Pos() {
        enemy.boostRes(2);
        assertEquals(6, enemy.getTotalRes());
    }
    
    @Test
    public void testBoostRes_Neg() {
        enemy.boostRes(-2);
        assertEquals(2, enemy.getTotalRes());
    }
    
    //Tests boostSpd of class Character which EnemyChar comes from.
    @Test
    public void testBoostSpd_Pos() {
        enemy.boostSpd(2);
        assertEquals(7, enemy.getTotalSpd());
    }
    
    @Test
    public void testBoostSpd_Neg() {
        enemy.boostSpd(-2);
        assertEquals(3, enemy.getTotalSpd());
    }
    
    //Tests setSkill of class Character which EnemyChar comes from.
    @Test
    public void testSetSkill_0() {
        Skill skill = new Skill(Stat.Attack, 2, "Test Stat", 100, "This is a test.");
        enemy.setSkill(skill, 0);
        assertEquals("Test Stat", enemy.getSkill(0).getName());
    }
    
    //Tests setSkill of class Character which EnemyChar comes from.
    @Test
    public void testSetSkill_1() {
        Skill skill = new Skill(Stat.Attack, 2, "Test Stat", 100, "This is a test.");
        enemy.setSkill(skill, 1);
        assertEquals("Test Stat", enemy.getSkill(1).getName());
    }
    
    //Tests setSkill of class Character which EnemyChar comes from.
    @Test
    public void testSetSkill_2() {
        Skill skill = new Skill(Stat.Attack, 2, "Test Stat", 100, "This is a test.");
        enemy.setSkill(skill, 2);
        assertEquals("Test Stat", enemy.getSkill(2).getName());
    }
    
    //Tests setSkill of class Character which EnemyChar comes from.
    @Test
    public void testSetSkill_Fail() {
        Skill skill = new Skill(Stat.Attack, 2, "Test Stat", 100, "This is a test.");
        enemy.setSkill(skill, 3);
        assertEquals(null, enemy.getSkill(3));
    }
    
    //Tests setWeapon of class Character which EnemyChar comes from.
    @Test
    public void testSetWeapon_NoBoost() {
        Weapon newWeapon = new Weapon(null, 0, "Test Weapon 2", 100, "This is a test.", WeaponType.Axe, 2, 1, DamageType.Physical);
        enemy.setWeapon(newWeapon);
        assertEquals("Test Weapon 2", enemy.getWeapon().getName());
        assertEquals(4, enemy.getTotalAtk());
    }
    
    @Test
    public void testSetWeapon_WithBoost() {
        Weapon newWeapon = new Weapon(Stat.Attack, 1, "Test Weapon 2", 100, "This is a test.", WeaponType.Axe, 3, 1, DamageType.Physical);
        enemy.setWeapon(newWeapon);
        assertEquals("Test Weapon 2", enemy.getWeapon().getName());
        assertEquals(6, enemy.getTotalAtk());
    }
    
    //Tests setRally of class Character which EnemyChar comes from.
    @Test
    public void testSetRally() {
        Rally newRally = new Rally(Stat.Attack, 2, "Test Rally 2", 100, "This is a test.", 1);
        enemy.setRally(newRally);
        assertEquals("Test Rally 2", enemy.getRally().getName());
    }
    
    //Tests equipRally of class Character which EnemyChar comes from.
    @Test
    public void testEquipRally() {
        Rally newRally = new Rally(Stat.Attack, 2, "Test Rally 2", 100, "This is a test.", 1);
        enemy.equipRally(newRally);
        assertEquals("Test Rally 2", enemy.getRally().getName());
    }
    
    //Tests increasedLevel of class Character which EnemyChar comes from.
    @Test
    public void testIncreasedLevel() {
        enemy.increaseLevel();
        assertEquals(2, enemy.getLevel());
    }
    
    //Tests givePermBoost of class Character which EnemyChar comes from.
    @Test
    public void testGivePermBoost_HP() {
        enemy.givePermBoost(Stat.HP, 1);
        assertEquals(11, enemy.getMaxHP());
        assertEquals(5, enemy.getTotalAtk());
    }
    
    //Tests givePermBoost of class Character which EnemyChar comes from.
    @Test
    public void testGivePermBoost_Atk() {
        enemy.givePermBoost(Stat.Attack, 1);
        assertEquals(6, enemy.getTotalAtk());
        assertEquals(3, enemy.getTotalDef());
    }
    
    //Tests givePermBoost of class Character which EnemyChar comes from.
    @Test
    public void testGivePermBoost_Def() {
        enemy.givePermBoost(Stat.Defense, 1);
        assertEquals(4, enemy.getTotalDef());
        assertEquals(4, enemy.getTotalRes());
    }
    
    //Tests givePermBoost of class Character which EnemyChar comes from.
    @Test
    public void testGivePermBoost_Res() {
        enemy.givePermBoost(Stat.Resistance, 1);
        assertEquals(5, enemy.getTotalRes());
        assertEquals(5, enemy.getTotalSpd());
    }
    
    //Tests givePermBoost of class Character which EnemyChar comes from.
    @Test
    public void testGivePermBoost_Spd() {
        enemy.givePermBoost(Stat.Speed, 1);
        assertEquals(6, enemy.getTotalSpd());
    }
    
    //Tests givePermBoost of class Character which EnemyChar comes from.
    @Test
    public void testGivePermBoost_Null() {
        enemy.givePermBoost(null, 1);
        assertEquals(10, enemy.getMaxHP());
        assertEquals(5, enemy.getTotalAtk());
        assertEquals(3, enemy.getTotalDef());
        assertEquals(4, enemy.getTotalRes());
        assertEquals(5, enemy.getTotalSpd());
    }
    
    //Tests givePermBoost of class Character which EnemyChar comes from.
    @Test
    public void testGivePermBoost_None() {
        enemy.givePermBoost(Stat.EXP, 1);
        assertEquals(10, enemy.getMaxHP());
        assertEquals(5, enemy.getTotalAtk());
        assertEquals(3, enemy.getTotalDef());
        assertEquals(4, enemy.getTotalRes());
        assertEquals(5, enemy.getTotalSpd());
    }
    
    //Tests equipSkill that is overriden in EnemyChar.
    @Test
    public void testEquipSkill() {
        Skill skill = new Skill(Stat.Attack, 2, "Test Skill", 100, "This is a test.");
        enemy.equipSkill(skill, 1);
        assertEquals("Test Skill", enemy.getSkill(1).getName());
    }
    
    //Tests equipWeapon that is overriden in EnemyChar.
    @Test
    public void testEquipWeapon() {
        Weapon newWeapon = new Weapon(null, 0, "Test Weapon 2", 100, "This is a test.", WeaponType.Axe, 3, 1, DamageType.Physical);
        enemy.equipWeapon(newWeapon);
        assertEquals("Test Weapon 2", enemy.getWeapon().getName());
    }
    
    //Test getMoveType of class EnemyChar.
    @Test
    public void testGetMoveType() {
        assertEquals(MoveType.Go, enemy.getMoveType());
    }
}
