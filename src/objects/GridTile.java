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
 * @dateUpdated - 4/1/2018 - added a distance integer for calculating the distance for AllyChars
 */
public class GridTile {
    
    private JButton tile;
    private Party party;
    private Char character;
    private boolean isAccessible;
    private boolean isOccupied;
    private int distance;
    
    public GridTile(JButton tile, boolean isAccessible) {
        this.tile = tile;
        this.isAccessible = isAccessible;
        this.isOccupied = false;
        this.distance = 100;
        this.party = null;
        this.character = null;
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
    
    public int getDistance() {
        return this.distance;
    }
    
    private void setAccessible(boolean isAccessible) {
        this.isAccessible = isAccessible;
    }
    
    private void setOccupied(Char character) {
        this.character = character;
    }
    
    public void setDistance(int distance) {
        this.distance = distance;
    }
    
    public void removeCharacter() {
        setAccessible(true);
        setOccupied(null);
        this.party = null;
        this.distance = 100;
    }
    
    public Party getParty() {
        return party;
    }
    
    public void addCharacter(Char character, Party party) {
        setAccessible(false);
        setOccupied(character);
        this.party = party;
        if (character instanceof AllyChar) {
            this.distance = 0;
        }
    }
    
    public Char getCharacter() {
        if(character != null)
            return character;
        return null;
    }
}
