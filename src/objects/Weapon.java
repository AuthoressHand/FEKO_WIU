/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import common.DamageType;
import common.Stat;
import common.WeaponType;

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated 12/5/2017
 * Holds the weapon that is used to attack or heal other players
 * 
 */
public class Weapon extends Skill{
    private WeaponType type;
    private int dmg;
    private int range;
    private DamageType dmgType;
    
    //creates the weapon
    public Weapon(Stat stat, int effect, String name, int spCost, String description, WeaponType type, int dmg, int range, DamageType dmgType) {
        super(stat, effect, name, spCost, description);
        this.type = type;
        this.dmg = dmg;
        this.range = range;
        this.dmgType = dmgType;
    }
    
    //returns the range of the weapon
    public int checkRange() {
        return this.range;
    }
    
    //returns the damage type of the weapon (either physical or magical)
    public DamageType getDmgType() {
        return this.dmgType;
    }
    
    //returns the amount of damage the weapon can do
    public int getDmg() {
        return this.dmg;
    }
    
    //returns the type of the weapon
    public WeaponType getType() {
        return this.type;
    }
}
