package entities.dungeon;

import java.util.ArrayList;
import java.util.List;

import entities.Item;
import entities.Monster;

public class Link {

	public enum ORIENTATION {
		NS, SN, EW, WE, UD, DU
	};

	private int id;
	private ORIENTATION orientation;

	private int length;
	
	private Room fromRoom;
	private Room toRoom;

	private List<Monster> monsters = new ArrayList<>();
	private List<Item> items = new ArrayList<>();

	public Link() {
	}

}
