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
 * Used to determine the what stat is effected and how much
 * 
 */
public abstract class Effect {
    private Stat stat;
    private int effect;
    
    public Effect(Stat stat, int effect) {
        this.stat = stat;
        this.effect = effect;
    }
    
    public Stat getStat() {
        return stat;
    }
    
    public int getEffect() {
        return effect;
    }
}
