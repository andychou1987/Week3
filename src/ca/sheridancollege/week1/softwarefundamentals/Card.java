/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author Andy Chou
 */
public class Card {
    private String suit;
    private int value;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Card(String s,int v){
        suit = s;
        value = v;
        if (s.equals("Hearts") || s.equals("Spades") ||s.equals("Diamonds") ||s.equals("Clubs")){
            System.out.println("The suit parameter is valid");
        }
        else System.out.println("The suit value is invalid" + "Choose a valid optionL Hearts, Spades, Clubs or Diamonds");
        if(v>0 && v<14){
            System.out.println("The card value is valid");
        }
        else System.out.println("Choose a valid card value 1-13 inclusive");
    }
    
}
