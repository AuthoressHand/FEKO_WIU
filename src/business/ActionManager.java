/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import objects.AllyChar;
import objects.GridTile;

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated - 4/20/2018
 * Used in conjuction with the MapGUI to retrieve values and do calculations
 */
public class ActionManager {
    public ActionManager() {
        
    }
    
    //Recalculates the GridTiles based on where the ally characters are
    public void recalculateLocationOfAllyChars(GridTile[] lowerGrid) {
        //resets all of the distances starting at the newest location and working around from there if the character inside a GridTile is a 
        int changes = 0;
        int original = 0;
        
        for (int i = 0; i < lowerGrid.length - 1; i++) {
            if (lowerGrid[i].getCharacter() != null && lowerGrid[i].getCharacter() instanceof AllyChar) {                
                //left - will always run - subtraction
                for (int j = 0; j <= i % 6; j++) {
                    //set up the first square
                    original = i - j;
                    lowerGrid[original].setDistance(j); //done so that the distance will automatically be set for the first
                    //System.out.println("GridTile[" + original + "]: " + lowerGrid[original].getDistance());
                    
                    //up - subtraction
                    while (original - 6 >= 0) {
                        if (changes == 0 || (lowerGrid[original].getDistance() + 1) < lowerGrid[original - 6].getDistance()) {
                            lowerGrid[original - 6].setDistance(lowerGrid[original].getDistance() + 1);
                            //System.out.println("GridTile[" + original + "]: " + lowerGrid[original].getDistance());
                        }
                        original -= 6;
                    }
                    
                    //down - addition
                    original = i - j; //resets it back at the original square
                    while (original + 6 <= lowerGrid.length - 1) {
                        if (changes == 0 || (lowerGrid[original].getDistance() + 1) < lowerGrid[original + 6].getDistance()) {
                            lowerGrid[original + 6].setDistance(lowerGrid[original].getDistance() + 1);
                            //System.out.println("GridTile[" + original + "]: " + lowerGrid[original].getDistance());
                        }
                        original += 6;
                    }
                }
                
                //right - will only run if it is not on the absolute edge - addition
                if ((i+1) % 6 != 0) {
                    for (int j = 1; (j + i) % 6 > 0; j++) {
                        original = i + j;
                        lowerGrid[original].setDistance(j);
                        //up - subtraction
                        while (original - 6 >= 0) {
                            if (changes == 0 || (lowerGrid[original].getDistance() + 1) < lowerGrid[original - 6].getDistance()) {
                                lowerGrid[original - 6].setDistance(lowerGrid[original].getDistance() + 1);
                                //System.out.println("GridTile[" + original + "]: " + lowerGrid[original].getDistance());
                            }
                            original -= 6;
                        }

                        //down - addition
                        original = i + j; //resets it back at the original square
                        while (original + 6 <= lowerGrid.length - 1) {
                            if (changes == 0 || (lowerGrid[original].getDistance() + 1) < lowerGrid[original + 6].getDistance()) {
                                lowerGrid[original + 6].setDistance(lowerGrid[original].getDistance() + 1);
                                //System.out.println("GridTile[" + original + "]: " + lowerGrid[original].getDistance());
                            }
                            original += 6;
                        }
                    }
                }
                changes += 1;
            }
        }
    }
    
    
}
