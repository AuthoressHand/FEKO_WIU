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
    private Char[] party;
    private ArrayList<Char> army;
    
    public Party() {
        army = new ArrayList<>();
        party = new Char[4];
    }
    
    public Party(int x) {
        army = new ArrayList<>();
        party = new Char[x];
    }
    
    public Party(ArrayList<Char> army, Char[] party) {
        this.setParty(party);
        this.setArmy(army);
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
        this.party[x] = character;
    }
    
    //sets the initial army
    private void setArmy(ArrayList<Char> army) {
        army.forEach((character) -> {
            this.addToArmy(character);
        });
    }
    
    //adds a character to the army
    public void addToArmy(Char character) {
        this.army.add(character);
    }
    
    //removes a character from the party
    public void removeFromParty(int x) {
        this.party[x] = null;
    }
    
    //removes a character from the party
    public void removeFromArmy(int x) {
        this.army.remove(x);
    }
    
    //gets a character from the army
    public Char getArmyChar(int x) {
        try{
            return army.get(x);
        } catch(NullPointerException e){
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
        return party[x];
    }
}
