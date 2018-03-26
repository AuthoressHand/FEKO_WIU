/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import javax.swing.*;
import objects.*;

/**
 *
 * @author Justin
 */
public class GridTile {
    
    private JButton tile;
    private Party party;
    private Char character;
    private boolean isAccessible;
    private boolean isOccupied;
    
    public GridTile(JButton tile, boolean isAccessible) {
        this.tile = tile;
        this.isAccessible = isAccessible;
        this.isOccupied = false;
    }
    
    public JButton getTile() {
        return tile;
    }
    
    public boolean isAccessible() {
        return isAccessible;
    }
    
    public boolean isOccupied() {
        return character != null;
    }
    
    private void setAccessible(boolean isAccessible) {
        this.isAccessible = isAccessible;
    }
    
    private void setOccupied(Char character) {
        this.character = character;
    }
    
    public void removeCharacter() {
        setAccessible(true);
        setOccupied(null);
        this.party = null;
    }
    
    public Party getParty() {
        return party;
    }
    
    public void addCharacter(Char character, Party party) {
        setAccessible(false);
        setOccupied(character);
        this.party = party;
    }
    
    public Char getCharacter() {
        if(character != null)
            return character;
        return null;
    }
}
