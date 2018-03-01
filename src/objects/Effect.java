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
 * @updated1 2/22/2018 - made new, empty constructor
 * Used to determine the what stats is effected and how much
 * 
 * 
 */
public abstract class Effect {
    private Stat stat;
    private int effect;
    
    public Effect() {
        
    }
    
    //set initial effect
    public Effect(Stat stat, int effect) {
        this.stat = stat;
        this.effect = effect;
    }
    
    //return the Stat effected
    public Stat getStat() {
        return stat;
    }
    
    //return the numerical effect it has
    public int getEffect() {
        return effect;
    }
}
