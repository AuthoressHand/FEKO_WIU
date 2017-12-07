/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import common.Stat;

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated 12/5/2017
 * Different things the characters can do
 */
public class Skill extends Effect {
    private String name;
    private int spCost;
    private String description;
    
    public Skill(Stat stat, int effect, String name, int spCost, String description) {
        super(stat, effect);
        this.name = name;
        this.spCost = spCost;
        this.description = description;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSPCost() {
        return spCost;
    }
    
    public String getDescription() {
        return description;
    }
}
