/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import common.CharType;
import common.Stat;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated 12/6/2017
 * The main object that the player controls and fights against during the game, lists out everything the character needs
 * This one is specifically the one the player controls
 * @updated 2/27/2018 - updated methods with comments, added new methods
 */
public class AllyChar extends Char {
    private int specialPoints;
    private int experience;
    private int hpIncrease;
    private int atkIncrease;
    private int defIncrease;
    private int resIncrease;
    private int spdIncrease;
    private ArrayList<Skill> unlockSkills;
    private ArrayList<Skill> lockSkills;
    private Random generator = new Random();
    
    public AllyChar(String name, int level) {
        super(name,level);
        this.experience = 0;
        this.specialPoints = 0;
        this.hpIncrease = 100;
        this.atkIncrease = 100;
        this.defIncrease = 100;
    }
    
    //sets ally information
    private void setAlly(int specialPoints, int experience, int hpIncrease, int atkIncrease, int defIncrease, int resIncrease, int spdIncrease, ArrayList<Skill> unlockSkills, ArrayList<Skill> lockSkills) {
        this.specialPoints = specialPoints;
        this.experience = experience;
        this.hpIncrease = hpIncrease;
        this.atkIncrease = atkIncrease;
        this.defIncrease = defIncrease;
        this.resIncrease = resIncrease;
        this.spdIncrease = spdIncrease;
        for (Skill unlocked : unlockSkills)
            this.unlockSkills.add(unlocked);
        for (Skill locked : lockSkills)
            this.lockSkills.add(locked);
    }
    
    //returns special points
    public int getSpecialPoints() {
        return this.specialPoints;
    }
    
    //returns experience points
    public int getExperience() {
        return this.experience;
    }
    
    //returns list of unlocked skills
    public ArrayList<Skill> getUnlockedSkills() {
        return this.unlockSkills;
    }
    
    //returns list of locked skills
    public ArrayList<Skill> getLockedSkills() {
        return this.lockSkills;
    }
    
    //increases the ally's stats, add special points, and takes away experience
    public void levelUp() {
        if (this.generator.nextInt(100) < this.hpIncrease)
            this.givePermBoost(Stat.HP, 1);
        if (this.generator.nextInt(100) < this.atkIncrease)
            this.givePermBoost(Stat.Attack, 1);
        if (this.generator.nextInt(100) < this.defIncrease)
            this.givePermBoost(Stat.Defense, 1);
        //if (this.generator.nextInt(100) < this.resIncrease)
        //    this.givePermBoost(Stat.Resistance, 1);
        //if (this.generator.nextInt(100) < this.spdIncrease)
        //    this.givePermBoost(Stat.Speed, 1);
        this.specialPoints += 12;
        this.increaseLevel();
        this.experience -= 100;
    }
    
    //adds experience to ally, if experience is over 100, ally levels up
    public void gainExperience(int exp) {
        this.experience += exp;
        if(this.experience >= 100)
            levelUp();
    }
    
    //unlocks skills and moves them to unlocked skills list
    public void purchaseSkill(Skill skill) {
        if(this.lockSkills.contains(skill) && skill.getSPCost() <= this.specialPoints) {
            this.unlockSkills.add(skill);
            this.lockSkills.remove(skill);
            this.specialPoints -= skill.getSPCost();
        }
    }
    
    //removes the skill equipped
    public void unequipSkill(int x) {
        this.equipSkill(null, x);
    }
    
    //removes the weapon equipped
    public void unequipWeapon() {
        this.equipWeapon(null);
    }
    
    //removes the rally equipped
    public void unequipRally() {
        this.equipRally(null);
    }
    
    @Override
    public void equipSkill(Skill skill, int x) {
        if (this.getSkill(x) != null)
            this.givePermBoost(this.getSkill(x).getStat(), -(this.getSkill(x).getEffect()));
        this.setSkill(skill, x);
    }
    
    @Override
    public void equipWeapon(Weapon weapon) {
        this.givePermBoost(weapon.getStat(), -(weapon.getEffect()));
        this.setWeapon(weapon);
    }
    
    
}
