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
 */
public class Party {
    private Character[] party;
    private ArrayList<Character> army;
    
    public Party(int x) {
        army = new ArrayList<Character>();
        party = new Character[x];
    }
    
    public Party(ArrayList<Character> army, Character[] party) {
        this.setParty(party);
        this.setArmy(army);
    }
    
    public int getPartySize() {
        return this.party.length;
    }
    
    private void setParty(Character[] party) {
        for (int i = 0; i < party.length; i++)
            this.addToParty(party[i], i);
    }
    
    public void addToParty(Character character, int x) {
        this.party[x] = character;
    }
    
    private void setArmy(ArrayList<Character> army) {
        for (Character character : army)
            this.addToArmy(character);
    }
    
    public void addToArmy(Character character) {
        this.army.add(character);
    }
    
    public void removeFromParty(int x) {
        this.party[x] = null;
    }
}
