/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import common.CharType;
import common.MoveType;
import java.awt.Image;

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated 12/6/2017
 * The main object that the player controls and fights against during the game, lists out everything the character needs
 */
public class EnemyChar extends Character {
    private MoveType moveType;
    
    //if(charType == ?)
        //do base attributes accordingly
    
    
    public EnemyChar(String name, int maxHP, Weapon weapon, int level, int attack, int defense, int resistance, int speed, Skill[] skills, Rally rally, Image charImg, CharType charType, MoveType moveType) {
        super(name, maxHP, weapon, level, attack, defense, resistance, speed, skills, rally, charImg, charType);
        this.moveType = moveType;
    }
    
    public EnemyChar(String name, int maxHP, Weapon weapon, int level, int attack, int defense, int resistance, int speed, int tempAttack, int tempDefense, int tempResistance, int tempSpeed, Skill[] skills, Rally rally, Image charImg, boolean active, CharType charType, MoveType moveType) {
        super(name, maxHP, weapon, level, attack, defense, resistance, speed, tempAttack, tempDefense, tempResistance, tempSpeed, skills, rally, charImg, active, charType);
        this.moveType = moveType;
    }
    
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
