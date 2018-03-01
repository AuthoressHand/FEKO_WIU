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
 */
public class Party {
    private Character[] party;
    private ArrayList<Character> army;
    
    public Party() {
        army = new ArrayList<Character>();
        party = new Character[4];
    }
    
    public Party(int x) {
        army = new ArrayList<Character>();
        party = new Character[x];
    }
    
    public Party(ArrayList<Character> army, Character[] party) {
        this.setParty(party);
        this.setArmy(army);
    }
    
    //returns the size of the party
    public int getPartySize() {
        return this.party.length;
    }
    
    //sets the initial party
    private void setParty(Character[] party) {
        for (int i = 0; i < party.length; i++)
            this.addToParty(party[i], i);
    }
    
    //adds a character to a specific slot in the party
    public void addToParty(Character character, int x) {
        this.party[x] = character;
    }
    
    //sets the initial army
    private void setArmy(ArrayList<Character> army) {
        for (Character character : army)
            this.addToArmy(character);
    }
    
    //adds a character to the army
    public void addToArmy(Character character) {
        this.army.add(character);
    }
    
    //removes a character from the party
    public void removeFromParty(int x) {
        this.party[x] = null;
    }
    
    //gets a character from the army
    public Character getArmyChar(int x) {
        return army.get(x);
    }
    
    //gets a character from the army
    public Character getArmyChar(String name) {
        for (Character character : army) {
            if (character.getName().compareTo(name) == 0) {
                return character;
            }
        }
        
        return null;
    }
    
    //returns a character from the party
    public Character getPartyChar(int x) {
        return party[x];
    }
}
