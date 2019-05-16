package entities.dungeon;

import java.util.ArrayList;
import java.util.List;

import entities.Item;
import entities.Monster;
import entities.dungeon.Level.LevelType;

public class Room {

	public enum RoomType {
		START, EXIT, NORMAL, ISOLATED, SPECIAL
	};

	private int id;
	private RoomType type;

	private int width;
	private int heigth;
	
	private String name;

	private List<Link> links = new ArrayList<>();

	private List<Monster> monsters = new ArrayList<>();
	private List<Item> items = new ArrayList<>();

	public Room() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RoomType getType() {
		return type;
	}

	public void setType(RoomType type) {
		this.type = type;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public List<Monster> getMonsters() {
		return monsters;
	}

	public void setMonsters(List<Monster> monsters) {
		this.monsters = monsters;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	/*****************************************/

	public static final Room createRoom() {

		final Room room = new Room();
		//room.setName(name);
		room.setHeigth(3);
		room.setWidth(3);
		room.setType(RoomType.NORMAL);
		
		//TODO : Monsteer, items, etc...
		
		return room;
	}
	
}
