/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import common.CharType;
import common.MoveType;
import javax.swing.ImageIcon;

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated 12/6/2017
 * The main object that the player controls and fights against during the game, lists out everything the character needs
 * @updated 2/27/2018 - made sure all methods had comment
 * @updated 3/18/2018 - updated constructors to match changes to Character class
 */
public class EnemyChar extends Character {
    private MoveType moveType;
    
    //if(charType == ?)
        //do base attributes accordingly
    
    
    public EnemyChar(String name, int maxHP, Weapon weapon, int level, int attack, int defense, int resistance, int speed, int walkRange, Skill[] skills, Rally rally, ImageIcon charImg, CharType charType, MoveType moveType) {
        super(name, maxHP, weapon, level, attack, defense, resistance, speed, walkRange, skills, rally, charImg, charType);
        this.moveType = moveType;
    }
    
    public EnemyChar(String name, int maxHP, int currentHP, Weapon weapon, int level, int attack, int defense, int resistance, int speed, int tempAttack, int tempDefense, int tempResistance, int tempSpeed, int walkRange, Skill[] skills, Rally rally, ImageIcon charImg, boolean active, CharType charType, MoveType moveType) {
        super(name, maxHP, currentHP, weapon, level, attack, defense, resistance, speed, tempAttack, tempDefense, tempResistance, tempSpeed, walkRange, skills, rally, charImg, active, charType);
        this.moveType = moveType;
    }
    
    //returns the movetype of the enemy
    public MoveType getMoveType() {
        return moveType;
    }
    
    @Override
    public void equipSkill(Skill skill, int x) {
        this.setSkill(skill, x);
    }
    
    @Override
    public void equipWeapon(Weapon weapon) {
        this.setWeapon(weapon);
    }
}
