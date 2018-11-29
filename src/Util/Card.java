package Util;

import java.io.Serializable;

/**
 * Abstract class to define the common properties of a Card object in Magic The Gathering.
 * name is the card name
 * set is the expansion set of the card
 * price is the latest price of the card
 * cardNum is the number the card is in the set
 * @TODO add lists to keep track of types(i.e. Artifact, Creature, instant, land) and sub-types (i.e. human, aura, golem)
 * @TODO add images?
 * @TODO three subclasses (cards w/toughness and power, cards w/o, and plainswalkers)
 * @author travis.john.thiel
 * 
 * */
public abstract class Card implements Serializable{
	
	private static final long serialVersionUID = 2956022314622475819L;
	private String name;
	private String set;
	private double price;
	private int cardNum;
	
	public Card() {
		name = "";
		set = "";
		price = -1.0;
		cardNum = -1;
	}
	
	public Card(String name, String set, double price, int cardNum) {
		this.name = name;
		this.set = set;
		this.price = price;
		this.cardNum = cardNum;
	}
	
	/**
	 * Edits the name of the card
	 * @param name the card name
	 * */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Returns the name of the card
	 * @return name the card name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Edits the expansion set of the card
	 * @param set the expansion set of the card
	 * */
	public void setSet(String set) {
		this.set = set;
	}
	
	/**
	 * Returns the expansion set of the card
	 * @return set the expansion set of the card
	 */
	public String getSet() {
		return set;
	}
	
	/**
	 * Edits the price of the card
	 * @param price the price of the card
	 * */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Returns the price of the card
	 * @return price the price of the card
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Edits the number of the card
	 * @param cardNum the number the card is in the set
	 * */
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
	/**
	 * Returns the number of the card
	 * @return cardNum the number the card is in the set
	 */
	public int getCardNum() {
		return cardNum;
	}
}
