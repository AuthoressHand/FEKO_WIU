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
 * 
 */
public class Weapon extends Skill {
    private WeaponType type;
    private int dmg;
    private int range;
    private DamageType dmgType;
    
    public Weapon(Stat stat, int effect, String name, int spCost, String description, WeaponType type, int dmg, int range, DamageType dmgType) {
        super(stat, effect, name, spCost, description);
        this.type = type;
        this.dmg = dmg;
        this.range = range;
        this.dmgType = dmgType;
    }
    
    public int checkRange() {
        return range;
    }
    
    public DamageType getDmgType() {
        return dmgType;
    }
    
    public int getDmg() {
        return dmg;
    }
    
    public WeaponType getType() {
        return type;
    }
}
