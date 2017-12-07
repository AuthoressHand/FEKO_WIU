/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import common.Stat;
import java.util.ArrayList;

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated 12/5/2017
 * Shows what the rally can do
 */
public class Rally extends Skill {
    private int range;
    
    public Rally(Stat stat, int effect, String name, int spCost, String description, int range) {
        super(stat, effect, name, spCost, description);
        this.range = range;
    }
    
    public int getRange() {
        return range;
    }
}
