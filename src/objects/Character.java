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

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated 12/5/2017
 * @updated 2/23/2018 - added new methods (getName), made edits to existing classes (givePermBoost), and comments for existing ones
 * The main object that the player controls and fights against during the game, lists out everything the character needs
 */
public abstract class Character {
    private String name;
    private int maxHP;
    private int currentHP;
    private Weapon weapon;
    private int level;
    private int attack;
    private int defense;
    private int resistance;
    private int speed;
    private int tempAttack;
    private int tempDefense;
    private int tempResistance;
    private int tempSpeed;
    private int walkRange;
    private Skill[] skills;
    private Rally rally;
    private Image charImg;
    private boolean active;
    private CharType charType;
    
    public Character(String name, int maxHP, Weapon weapon, int level, int attack, int defense, int resistance, int speed, Skill[] skills, Rally rally, Image charImg, CharType charType) {
        this.setCharacter(name, maxHP, weapon, level, attack, defense, resistance, speed, skills, rally, charImg, charType);
    }
    
    public Character(String name, int maxHP, Weapon weapon, int level, int attack, int defense, int resistance, int speed, int tempAttack, int tempDefense, int tempResistance, int tempSpeed, Skill[] skills, Rally rally, Image charImg, boolean active, CharType charType) {
        this.setCharacter(name, maxHP, weapon, level, attack, defense, resistance, speed, skills, rally, charImg, charType);
        this.tempAttack = tempAttack;
        this.tempDefense = tempDefense;
        this.tempResistance = tempResistance;
        this.tempSpeed = tempSpeed;
        this.active = active;
    }
    
    //sets the character's information
    private void setCharacter(String name, int maxHP, Weapon weapon, int level, int attack, int defense, int resistance, int speed, Skill[] skills, Rally rally, Image charImg, CharType charType) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.equipWeapon(weapon);
        this.level = level;
        this.attack = attack;
        this.defense = defense;
        this.resistance = resistance;
        this.speed = speed;
        this.skills = new Skill[3];
        for (int i = 0; i < skills.length; i++)
            this.skills[i] = skills[i];
        this.equipRally(rally);
        this.charImg = charImg;
        this.active = true;
        this.charType = charType;
    }
    
    //used to return information about the character
    //returns the name of a character
    public String getName() {
        return this.name;
    }
    
    //returns max hp
    public int getMaxHP() {
        return this.maxHP;
    }
    
    //returns current hp
    public int getCurrentHP() {
        return this.currentHP;
    }
    
    //returns the character's weapon
    public Weapon getWeapon() {
        return this.weapon;
    }
    
    //returns the current level of the character
    public int getLevel() {
        return this.level;
    }
    
    //returns the total attack of a character
    public int getTotalAtk() {
        return this.attack + this.tempAttack;
    }
    
    //returns the total defense of a character
    public int getTotalDef() {
        return this.defense + this.tempDefense;
    }
    
    //returns the total resistance of a character
    public int getTotalRes() {
        return this.resistance + this.tempResistance;
    }
    
    //returns the total speed of a character
    public int getTotalSpd() {
        return this.speed + this.tempSpeed;
    }
    
    //returns the walking range of a character
    public int getWalkRange() {
        return this.walkRange;
    }
    
    //returns a specific skill of a character
    public Skill getSkill(int x) {
        return this.skills[x];
    }
    
    //returns the image of a character
    public Image getCharImg() {
        return this.charImg;
    }
    
    //returns if the character is active or not
    public boolean getActive() {
        return this.active;
    }
    
    //returns what the character's type is
    public CharType getCharType() {
        return this.charType;
    }
    
    //used for the gameplay elements
    //reactivates the character to perform another action
    public void reactivate() {
        this.active = true;
    }
    
    //deactivates the character after performing an action
    public void deactivate() {
        this.active = false;
    }
    
    //lowers the hp of a character, a negative hp input heals a character (if the hp goes above the max, it will instead become the max)
    public void changeHP(int hp) {
        this.currentHP -= hp;
        if (this.currentHP > this.maxHP)
            this.currentHP = this.maxHP;
    }
    
    //boosts the attack of a character for one turn
    public void boostAtk(int atkBoost) {
        this.tempAttack += atkBoost;
    }
    
    //boosts the defense of a charcter for one turn
    public void boostDef(int defBoost) {
        this.tempDefense += defBoost;
    }
    
    //boosts the resistance of a character for one turn
    public void boostRes(int refBoost) {
        this.tempResistance += refBoost;
    }
    
    //boosts the speed of a character for one turn
    public void boostSpd(int spdBoost) {
        this.tempSpeed += spdBoost;
    }
    
    //sets a skill of a character, but only from the ones they already have
    protected void setSkill(Skill skill, int x) {
        this.skills[x].equals(skill);
        this.givePermBoost(skill.getStat(), skill.getEffect());
    }
    
    //sets the weapon of a character
    protected void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        if (weapon.getStat() != null)
            givePermBoost(weapon.getStat(), weapon.getEffect());
    }
    
    //sets the rally of a character
    protected void setRally(Rally rally) {
        this.rally = rally;
    }
    
    public abstract void equipSkill(Skill skill, int x);
    
    public abstract void equipWeapon(Weapon weapon);
    
    //sends the rally on to be set
    public void equipRally(Rally rally) {
        this.setRally(rally);
    }
    
    //increases the level of a character
    protected void increaseLevel() {
        this.level += 1;
    }
    
    //goes through if statements to set a permanent boost to the stats 
    protected void givePermBoost(Stat stat, int effect) {
        if (stat != null) 
            switch (stat) {
                case HP:
                    this.maxHP += effect;
                    break;
                case Attack:
                    this.attack += effect;
                    break;
                case Defense:
                    this.defense += effect;
                    break;
                case Resistance:
                    this.resistance += effect;
                    break;
                case Speed:
                    this.speed = effect;
                    break;
                default:
                    break;
            }
    }
}
