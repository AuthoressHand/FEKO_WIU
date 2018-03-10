/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import javax.swing.*;

/**
 *
 * @author Justin
 */
public class GridTile {
    
    private JButton tile;
    private boolean isAccessible;
    
    public GridTile(JButton tile, boolean isAccessible) {
        this.tile = tile;
        this.isAccessible = isAccessible;
    }
    
    public JButton getTile() {
        return tile;
    }
    
    public boolean isAccessible() {
        return isAccessible;
    }
    
    public void setAccessible(boolean isAccessible) {
        this.isAccessible = isAccessible;
    }
}
