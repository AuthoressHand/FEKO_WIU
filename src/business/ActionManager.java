/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import objects.AllyChar;
import objects.Char;
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
                    if (changes == 0 || lowerGrid[original].getDistance() >= j)
                        lowerGrid[original].setDistance(j); //done so that the distance will automatically be set for the first
                    
                    //up - subtraction
                    while (original - 6 >= 0) {
                        if (changes == 0 || (lowerGrid[original].getDistance() + 1) < lowerGrid[original - 6].getDistance()) {
                            lowerGrid[original - 6].setDistance(lowerGrid[original].getDistance() + 1);
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
                        if (changes == 0 || lowerGrid[original].getDistance() >= j)
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
        boolean ifAlly = true;
        for (int j = 0; j < lowerGrid.length; j++) {
            if (lowerGrid[j].isOccupied() && lowerGrid[j].getCharacter() instanceof AllyChar)
                ifAlly = true;
            else
                ifAlly = false;
            System.out.println("Grid[" + j + "]: " + lowerGrid[j].getDistance() + ", " + ifAlly);
        }
    }
    
    //used to calculate which square the character will move to
    public int calculateNewPlace(GridTile[] lowerGrid, Char currentChar, int currentSpace) {
        int closestPlace = currentSpace;
        int i = currentSpace;
        
        //find the closest character by checking up, down, left, and right
        for (int j = 0; j < currentChar.getWalkRange(); j++) {
            //left
            //check to see if there is anywhere to go to the left
            if (i % 6 != 0) {
                //check to see if someone is already there and is a 
                if (lowerGrid[i-1].getDistance() == 0 /*&& lowerGrid[i-1].getCharacter() instanceof AllyChar*/) {
                    closestPlace = i-1;
                    return closestPlace;
                }
                //check to see if it is accessible
                if (lowerGrid[i-1].isAccessible()) {
                    if (!lowerGrid[i-1].isOccupied() && lowerGrid[i-1].getDistance() <= lowerGrid[i].getDistance() && 
                            lowerGrid[i-1].getDistance() <= lowerGrid[closestPlace].getDistance()) {
                        closestPlace = i-1;
                    }
                }
            }

            //right
            if (i % 6 != 5) {
                //check to see if someone is already there and is a 
                if (lowerGrid[i+1].getDistance() == 0 /*&& lowerGrid[i+1].getCharacter() instanceof AllyChar*/) {
                    closestPlace = i+1;
                    return closestPlace;
                }
                //check to see if it is accessible
                if (lowerGrid[i+1].isAccessible()) {
                    if (!lowerGrid[i+1].isOccupied() && lowerGrid[i+1].getDistance() <= lowerGrid[i].getDistance() && 
                            lowerGrid[i+1].getDistance() <= lowerGrid[closestPlace].getDistance()) {
                        closestPlace = i+1;
                    }
                }
            }

            //up
            if (i - 6 >= 0) {
                //check to see if someone is already there and is a 
                if (lowerGrid[i-6].getDistance() == 0 /*&& lowerGrid[i-6].getCharacter() instanceof AllyChar*/) {
                    closestPlace = i-6;
                    return closestPlace;
                }
                //check to see if it is accessible
                if (lowerGrid[i-6].isAccessible()) {
                    if (!lowerGrid[i-6].isOccupied() && lowerGrid[i-6].getDistance() <= lowerGrid[i].getDistance() && 
                            lowerGrid[i-6].getDistance() <= lowerGrid[closestPlace].getDistance()) {
                        closestPlace = i-6;
                    }
                }
            }

            //down
            if (i + 6 < lowerGrid.length) {
                //check to see if someone is already there and is a 
                if (lowerGrid[i+6].getDistance() == 0 /*&& lowerGrid[i+6].getCharacter() instanceof AllyChar*/) {
                    closestPlace = i+6;
                    return closestPlace;
                }
                //check to see if it is accessible
                if (lowerGrid[i+6].isAccessible()) {
                    if (!lowerGrid[i+6].isOccupied() && lowerGrid[i+6].getDistance() <= lowerGrid[i].getDistance() && 
                            lowerGrid[i+6].getDistance() <= lowerGrid[closestPlace].getDistance()) {
                        closestPlace = i+6;
                    }
                }
            }
            
            //have i = cloesetPlace so that it will continue to check the closest areas
            i = closestPlace;
        }
        
        return closestPlace;
    }
}
