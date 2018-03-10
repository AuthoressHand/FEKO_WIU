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
    private Character character;
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
    
    public void setAccessible(boolean isAccessible) {
        this.isAccessible = isAccessible;
    }
    
    public void setOccupied(Character character) {
        this.character = character;
    }
    
    public void removeCharacter() {
        setAccessible(true);
        setOccupied(null);
    }
    
    public void addCharacter(Character character) {
        setAccessible(false);
        setOccupied(character);
    }
    
    public Character getCharacter() {
        if(character != null)
            return character;
        return null;
    }
}
