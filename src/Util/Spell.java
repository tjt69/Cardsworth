package Util;

import java.util.List;

public class Spell extends Card{
	private static final long serialVersionUID = 7060541221859518041L;
	
	private int[] manaCost;
	private List<String> types;
	private List<String> subTypes;
	private String text;
	
	public Spell() {
		super();
		manaCost = new int[] {-1,-1,-1,-1,-1,-1};
		types = null;
		subTypes = null;
		text = "";
	}
	public Spell(String name, String set, double price, int cardNum, int[] manaCost, List<String> types, List<String> subTypes, String text) {
		super();
		this.manaCost = manaCost;
		this.types = types;
		this.subTypes = subTypes;
		this.text = text;
	}

}
