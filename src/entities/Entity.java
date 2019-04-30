package entities;

import java.util.ArrayList;
import java.util.List;

public class Entity {

	public enum EntityType {
		HUMAN, DWARF, ELF, ORC, GOBLIN, ELEMENTAL
	};

	private String name;
	private EntityType type;

	private int level;

	private int currentVitality;

	private int maxVitality;

	private int currentMana;
	private int maxMana;

	private int str;
	private int dex;
	private int con;
	private int mag;

	private int resfis;
	private int resmag;

	private long gold;
	private List<Item> items = new ArrayList<>();

	public Entity() {
	}

	public EntityType getType() {
		return type;
	}

	public void setType(EntityType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public int getMag() {
		return mag;
	}

	public void setMag(int mag) {
		this.mag = mag;
	}

	public int getResfis() {
		return resfis;
	}

	public void setResfis(int resfis) {
		this.resfis = resfis;
	}

	public int getResmag() {
		return resmag;
	}

	public void setResmag(int resmag) {
		this.resmag = resmag;
	}

	public int getCurrentVitality() {
		return currentVitality;
	}

	public void setCurrentVitality(int currentVitality) {
		this.currentVitality = currentVitality;
	}

	public int getMaxVitality() {
		return maxVitality;
	}

	public void setMaxVitality(int maxVitality) {
		this.maxVitality = maxVitality;
	}

	public int getCurrentMana() {
		return currentMana;
	}

	public void setCurrentMana(int currentMana) {
		this.currentMana = currentMana;
	}

	public int getMaxMana() {
		return maxMana;
	}

	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}

	public long getGold() {
		return gold;
	}

	public void setGold(long gold) {
		this.gold = gold;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String toString() {
		final StringBuilder stringBuilder = new StringBuilder("Name: " + getName());

		stringBuilder.append("\n Type: " + getType());
		stringBuilder.append("\n\t Level: " + getLevel());
		stringBuilder.append("\n\t Vitality: " + getCurrentVitality() + " / " + getMaxVitality());
		stringBuilder.append("\n\t Mana: " + getCurrentMana() + " / " + getMaxMana());

		stringBuilder.append("\n\t\t Str: " + getStr());
		stringBuilder.append("\n\t\t Dex: " + getDex());
		stringBuilder.append("\n\t\t Con: " + getCon());
		stringBuilder.append("\n\t\t Mag: " + getMag());

		stringBuilder.append("\n\t Res Fis: " + getResfis());
		stringBuilder.append("\n\t Res Mag: " + getResmag());

		stringBuilder.append("\n\t Gold: " + getGold());

		stringBuilder.append("\n Items: " + getItems());
		return stringBuilder.toString();
	}

	/**********************************/

	public Entity createEntity() {
		final Entity entity = new Entity();
		
		return entity;
	}

}
