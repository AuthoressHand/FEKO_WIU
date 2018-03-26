/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.ArrayList;

/**
 *
 * @author Rose Steffensmeier
 * @dateCreated 12/6/2017
 * Has all of the characters together in a single list, the party is for those fighting and the army is for those that are on the back burner
 * @updated 2/27/2018 - created new constructor, made sure all methods have comments
 * @updated 3/25/2018 - debugging, updating so that multiples of the same character won't be in the army or the party
 */
public class Party {
    private Char[] party;
    private ArrayList<Char> army;
    
    public Party() {
        this.setClass(4);
    }
    
    public Party(int x) {
        this.setClass(x);
    }
    
    public Party(ArrayList<Char> army, Char[] party) {
        this.setClass(party.length);
        this.setParty(party);
        this.setArmy(army);
    }
    
    private void setClass(int x) {
        this.army = new ArrayList<>();
        this.party = new Char[x];
    }
    
    //returns the size of the party
    public int getPartySize() {
        return this.party.length;
    }
    
    public int getArmySize() {
        return this.army.size();
    }
    
    //sets the initial party
    private void setParty(Char[] party) {
        for (int i = 0; i < party.length; i++)
            this.addToParty(party[i], i);
    }
    
    //adds a character to a specific slot in the party
    public void addToParty(Char character, int x) {
        try {
            for (int i = 0; i < this.party.length; i++)
                if (this.party[i] == character)
                    return;
            this.party[x] = character;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array out of bounds. Character could not be added.");
        }
    }
    
    //sets the initial army
    private void setArmy(ArrayList<Char> army) {
        army.forEach((character) -> {
            this.addToArmy(character);
        });
    }
    
    //adds a character to the army
    public void addToArmy(Char character) {
        if (!this.army.contains(character))
            this.army.add(character);
    }
    
    //removes a character from the party
    public void removeFromParty(int x) {
        try {
            this.party[x] = null;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array out of bounds. Character couldn't be removed.");
        }
    }
    
    //removes a character from the party
    public void removeFromArmy(int x) {
        this.army.remove(x);
    }
    
    //gets a character from the army
    public Char getArmyChar(int x) {
        try {
            return army.get(x);
        }
        catch (IndexOutOfBoundsException ex) {
            return null;
        }
    }
    
    //gets a character from the army
    public Char getArmyChar(String name) {
        for (Char character : army) {
            if (character.getName().compareTo(name) == 0) {
                return character;
            }
        }
        
        return null;
    }
    
    //returns a character from the party
    public Char getPartyChar(int x) {
        try {
            return party[x];
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return null;
        }
    }
    
    //returns entire party
    public Char[] getParty() {
        return this.party;
    }
    
    //returns entire army
    public ArrayList<Char> getArmy() {
        return this.army;
    }
}
