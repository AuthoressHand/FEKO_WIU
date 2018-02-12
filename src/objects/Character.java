
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import common.CharType;
import common.Stat;
import common.WeaponType;
import javax.swing.ImageIcon;

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated 12/5/2017
 * The main object that the player controls and fights against during the game, lists out everything the character needs
 */
public class Character {
    private String name;
    private int maxHP;
    private int currentHP;
    private Weapon weapon;
    private int level;
    private int attack;
    private int defense;
    //private int resistance;
    //private int speed;
    //private int tempAttack;
    //private int tempDefense;
    //private int tempResistance;
    //private int tempSpeed;
    //private int walkRange;
    //private Skill[] skills;
    //private Rally rally;
    private ImageIcon charImg;
    //private boolean active;
    private CharType charType;
    
    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.maxHP = 10 + level;
        this.weapon = new Weapon(WeaponType.Sword);
        this.attack = 2;
        this.defense = 2;
        
        switch(name) {
            case "Anna": 
                this.charImg = new ImageIcon(getClass().getResource("/img/characters/anna.png"));
                break;
            case "Zeph":
                this.charImg = new ImageIcon(getClass().getResource("/img/characters/zeph.png"));
                break;
        }
        
    }
    
    /*public Character(String name, int maxHP, Weapon weapon, int level, int attack, int defense, int resistance, int speed, int tempAttack, int tempDefense, int tempResistance, int tempSpeed, Skill[] skills, Rally rally, Image charImg, boolean active, CharType charType) {
        this.setCharacter(name, maxHP, weapon, level, attack, defense, resistance, speed, skills, rally, charImg, charType);
        this.tempAttack = tempAttack;
        this.tempDefense = tempDefense;
        this.tempResistance = tempResistance;
        this.tempSpeed = tempSpeed;
        this.active = active;
    }*/
    
    /*private void setCharacter(String name, int maxHP, Weapon weapon, int level, int attack, int defense, int resistance, int speed, Skill[] skills, Rally rally, Image charImg, CharType charType) {
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
    }*/
    
    /*public void reactivate() {
        this.active = true;
    }
    
    public void deactivate() {
        this.active = false;
    }*/
    
    public void changeHP(int hp) {
        this.currentHP -= hp;
        if (this.currentHP > this.maxHP)
            this.currentHP = this.maxHP;
    }
    /*
    public void boostAtk(int atkBoost) {
        this.tempAttack += atkBoost;
    }
    
    public void boostDef(int defBoost) {
        this.tempDefense += defBoost;
    }
    
    public void boostRes(int refBoost) {
        this.tempResistance += refBoost;
    }
    
    public void boostSpd(int spdBoost) {
        this.tempSpeed += spdBoost;
    }
    */
    public int getTotalAtk() {
        return this.attack + weapon.getDmg(); //+ this.tempAttack;
    }
    
    public int getTotalDef() {
        return this.defense; // + this.tempDefense;
    }
    /*
    public int getTotalRes() {
        return this.resistance + this.tempResistance;
    }
    
    public int getTotalSpd() {
        return this.speed + this.tempSpeed;
    }
    
    public int getWalkRange() {
        return this.walkRange;
    }*/
    
    public ImageIcon getCharImg() {
        return this.charImg;
    }
    /*
    public Skill getSkill(int x) {
        return this.skills[x];
    }
    
    protected void setSkill(Skill skill, int x) {
        this.skills[x].equals(skill);
        this.givePermBoost(skill.getStat(), skill.getEffect());
    }*/
    
    protected void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        /*if (weapon.getStat() != null)
            givePermBoost(weapon.getStat(), weapon.getEffect());*/
    }
    /*
    protected void setRally(Rally rally) {
        this.rally = rally;
    }
    
    public abstract void equipSkill(Skill skill, int x);
    
    public abstract void equipWeapon(Weapon weapon);
    
    public void equipRally(Rally rally) {
        this.setRally(rally);
    }
    */
    protected void increaseLevel() {
        this.level += 1;
    }
    
    protected void givePermBoost(Stat stat, int effect) {
        if (null != stat) switch (stat) {
            case HP:
                this.maxHP += effect;
                break;
            case Attack:
                this.attack += effect;
                break;
            case Defense:
                this.defense += effect;
                break;
            /*case Resistance:
                this.resistance += effect;
                break;
            case Speed:
                this.speed = effect;
                break;*/
            default:
                break;
        }
    }
}
