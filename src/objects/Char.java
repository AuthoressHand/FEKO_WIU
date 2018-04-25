
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import common.CharType;
import common.DamageType;
import common.Stat;
import common.WeaponType;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated 12/5/2017
 * @updated 2/23/2018 - added new methods (getName), made edits to existing classes (givePermBoost), and comments for existing ones - Rose
 * @updated 3/18/2018 - forgot to include walkRange in constructors and getRally method - Rose
 * @updated 3/21/2018 - added error testing to methods involving arrays, added no skill to constructor to avoid NullPointerException, general debugging - Rose
 * @updated 4/16/2018 - created new, smaller constructor that uses random number generator to create the other stats - Rose
 * @updated 4/22/2018 - rebalanced stats - Rose
 * The main object that the player controls and fights against during the game, lists out everything the character needs
 */
public abstract class Char {
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
    private ImageIcon img;
    private ImageIcon portraitImageIdle;
    private ImageIcon portraitImageClicked;
    private ImageIcon portraitBattle;
    private boolean active;
    private CharType charType;
    private Skill defaultSkill;
    
    /*public Char(String name, int level) {
        this.name = name;
        this.level = level;
        this.maxHP = 1;
        this.currentHP = this.maxHP;
        this.weapon = new Weapon(null, 0, "Bronze Sword", 0, "Basic Sword, starting equipment", WeaponType.Sword, 5, 1, DamageType.Physical);
        this.attack = 1;
        this.defense = 1;
        this.walkRange = 2;
        
        switch(name) {
            case "Anna": 
                this.img = new ImageIcon(getClass().getResource("/img/characters/anna.png"));
                this.portraitBattle = new ImageIcon(getClass().getResource("/img/portraits/anna_battle_portrait.png"));
                this.portraitImageIdle = new ImageIcon(getClass().getResource("/img/portraits/anna_silver_portrait_idle.png"));
                this.portraitImageClicked = new ImageIcon(getClass().getResource("/img/portraits/anna_silver_portrait_clicked.png"));
                break;
            case "Zephiel":
                this.img = new ImageIcon(getClass().getResource("/img/characters/zephiel.png"));
                this.portraitBattle = new ImageIcon(getClass().getResource("/img/portraits/zephiel_battle_portrait.png"));
                break;
            case "Axe Man":
                this.img = new ImageIcon(getClass().getResource("/img/characters/axeman.png"));
                this.portraitBattle = new ImageIcon(getClass().getResource("/img/portraits/axeman_battle_portrait.png"));
                break;
            case "Surtr":
                this.img = new ImageIcon(getClass().getResource("/img/characters/surtr.png"));
                this.portraitBattle = new ImageIcon(getClass().getResource("/img/portraits/surtr_battle_portrait.png"));
                break;
            case "Alfonse":
                this.img = new ImageIcon(getClass().getResource("/img/characters/alfonse.png"));
                this.portraitBattle = new ImageIcon(getClass().getResource("/img/portraits/alfonse_battle_portrait.png"));
                this.portraitImageIdle = new ImageIcon(getClass().getResource("/img/portraits/alfonse_silver_portrait_idle.png"));
                this.portraitImageClicked = new ImageIcon(getClass().getResource("/img/portraits/alfonse_silver_portrait_clicked.png"));
                break;
            case "Black Knight":
                this.img = new ImageIcon(getClass().getResource("/img/characters/blackknight.png"));
                this.portraitBattle = new ImageIcon(getClass().getResource("/img/portraits/blackknight_battle_portrait.png"));
                break;
            case "Hawkeye":
                this.img = new ImageIcon(getClass().getResource("/img/characters/hawkeye.png"));
                this.portraitBattle = new ImageIcon(getClass().getResource("/img/portraits/hawkeye_battle_portrait.png"));
                break;
            case "Roy":
                this.img = new ImageIcon(getClass().getResource("/img/characters/roy.png"));
                this.portraitBattle = new ImageIcon(getClass().getResource("/img/portraits/roy_battle_portrait.png"));
                this.portraitImageIdle = new ImageIcon(getClass().getResource("/img/portraits/roy_silver_portrait_idle.png"));
                this.portraitImageClicked = new ImageIcon(getClass().getResource("/img/portraits/roy_silver_portrait_clicked.png"));
                break;
            case "Selena":
                this.img = new ImageIcon(getClass().getResource("/img/characters/selena.png"));
                this.portraitBattle = new ImageIcon(getClass().getResource("/img/portraits/selena_battle_portrait.png"));
                this.portraitImageIdle = new ImageIcon(getClass().getResource("/img/portraits/selena_silver_portrait_idle.png"));
                this.portraitImageClicked = new ImageIcon(getClass().getResource("/img/portraits/selena_silver_portrait_clicked.png"));
                break;
            case "Soleil":
                this.img = new ImageIcon(getClass().getResource("/img/characters/soleil.png"));
                this.portraitBattle = new ImageIcon(getClass().getResource("/img/portraits/soleil_battle_portrait.png"));
                this.portraitImageIdle = new ImageIcon(getClass().getResource("/img/portraits/soleil_silver_portrait_idle.png"));
                this.portraitImageClicked = new ImageIcon(getClass().getResource("/img/portraits/soleil_silver_portrait_clicked.png"));
                break;
        }
        
    }*/
    
    public Char(String name, int level, int walkRange, Weapon weapon) {
        Random random = new Random();
        
        this.name = name;
        this.level = level;
        this.maxHP = random.nextInt(3) + 9 + level;
        this.currentHP = this.maxHP;
        this.weapon = weapon;
        this.attack = random.nextInt(3) + 1 + level/2;
        this.defense = random.nextInt(2) + 1 + level/2;
        this.resistance = random.nextInt(2) + 1 + level/2;
        this.speed = random.nextInt(2) + 1 + level/2;
        this.walkRange = walkRange;
        this.img = new ImageIcon(getClass().getResource("/img/characters/" + name.toLowerCase().replace(" ", "") + ".png"));
        this.portraitBattle = new ImageIcon(getClass().getResource("/img/portraits/" + name.toLowerCase().replace(" ", "") + "_battle_portrait.png"));
    }
    
    //the next two constructors are for testing purposes only
    protected Char(String name, int maxHP, Weapon weapon, int level, int attack, int defense, int resistance, int speed, int walkRange, Skill[] skills, Rally rally, ImageIcon charImg, CharType charType) {
        this.setCharacter(name, maxHP, maxHP, weapon, level, attack, defense, resistance, speed, walkRange, skills, rally, charImg, charType);
    }
    
    protected Char(String name, int maxHP, int currentHP, Weapon weapon, int level, int attack, int defense, int resistance, int speed, int tempAttack, int tempDefense, int tempResistance, int tempSpeed, int walkRange, Skill[] skills, Rally rally, ImageIcon charImg, boolean active, CharType charType) {
        this.setCharacter(name, maxHP, currentHP, weapon, level, attack, defense, resistance, speed, walkRange, skills, rally, charImg, charType);
        this.tempAttack = tempAttack;
        this.tempDefense = tempDefense;
        this.tempResistance = tempResistance;
        this.tempSpeed = tempSpeed;
        this.active = active;
    }
    
    //sets the character's information, used for testing purposes only
    private void setCharacter(String name, int maxHP, int currentHP, Weapon weapon, int level, int attack, int defense, int resistance, int speed, int walkRange, Skill[] skills, Rally rally, ImageIcon charImg, CharType charType) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.equipWeapon(weapon);
        this.level = level;
        this.attack = attack;
        this.defense = defense;
        this.resistance = resistance;
        this.speed = speed;
        this.walkRange = walkRange;
        this.skills = new Skill[3];
        defaultSkill = new Skill(null, 0, "", 0, "Skill not equipped.");
        for (int i = 0; i < 3; i++) {
            if (skills[i] == null)
                this.skills[i] = defaultSkill;
            else
                this.skills[i] = skills[i];
        }
        this.equipRally(rally);
        this.img = charImg;
        this.active = true;
        this.charType = charType;
    }
    
    protected void setImages() {
        this.portraitImageIdle = new ImageIcon(getClass().getResource("/img/portraits/" + this.name.toLowerCase() + "_silver_portrait_idle.png"));
        this.portraitImageClicked = new ImageIcon(getClass().getResource("/img/portraits/" + this.name.toLowerCase() + "_silver_portrait_clicked.png"));
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
        return this.attack + weapon.getDmg() + this.tempAttack;
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
        try {
            return this.skills[x];
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return null;
        }
        catch (NullPointerException ex) {
            return null;
        }
    }
    
    //returns the rally of a charater
    public Rally getRally() {
        try {
            return this.rally;
        }
        catch (NullPointerException ex) {
            return null;
        }
    }
    
    //returns the image of a character
    public ImageIcon getImg() {
        return img;
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
        try {
            this.skills[x] = skill;
            this.givePermBoost(skills[x].getStat(), skills[x].getEffect());
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array out of bounds. Skill not set.");
        }
        catch (NullPointerException ex) {
            this.skills[x] = defaultSkill;
            this.givePermBoost(skills[x].getStat(), skills[x].getEffect());
        }
    }
    
    //sets the weapon of a character
    protected void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        //if (weapon.getStat() != null)
        this.givePermBoost(weapon.getStat(), weapon.getEffect());
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
    
    public void resetHP() {
        currentHP = maxHP;
    }
    
    //returns the idle portrait image of a character
    public ImageIcon getPortaitImageIdle() {
        if(portraitImageIdle != null)    
            return portraitImageIdle;
        return null;
    }
    
    //returns the clicked portrait image of a character
    public ImageIcon getPortaitImageClicked() {
        if(portraitImageClicked != null)     
            return portraitImageClicked;
        return null;
    }
    
    //returns the clicked portrait image of a character
    public ImageIcon getBattlePortrait() {
        return portraitBattle;
    }
    
    //goes through if statements to set a permanent boost to the stats 
    public void givePermBoost(Stat stat, int effect) {
        if (stat != null) 
            switch (stat) {
                case HP:
                    this.maxHP += effect;
                    this.currentHP += effect;
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
                    this.speed += effect;
                    break;
                default:
                    break;
            }
    }
}
