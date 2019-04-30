package entities;

import java.util.Random;

public class Item {

	public static String[][] ITEMS = new String[][] { { "Health Drink", "Restore 150 HP." },
			{ "Healing Potion", "Restore 400 HP." }, { "Healing Elixir", "Restore HP to the maximum." },
			{ "Mage's Soul", "Restore 100 SP." }, { "Emperor's Soul", "Restore SP to the maximum." },
			{ "Noble Wine", "Restore HP and SP to the maximum." },
			{ "Antidote", "Cure poison, paralysis, speed down, and decrease in physical status." },
			{ "Restorative", "Cure curse, sleep, confusion, charm, and decrease in magical status." },
			{ "Resurrect", "Revive a dead ally." } };

	public static String[] TYPES = new String[] { "ITEM", "WEAPON", "ARMOR", "UTILITY", "SPECIAL" };

	private String name;
	private String description;
	private String type;
	private int weigth;

	public Item() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public String toString() {
		final StringBuilder stringBuilder = new StringBuilder("Name: " + getName());
		stringBuilder.append("\n\t Description: " + getDescription());
		stringBuilder.append("\n\t Type: " + getType());
		stringBuilder.append("\n\t Weigth :" + getWeigth());
		return stringBuilder.toString();
	}

	/**************************************************/

	private static final Random random = new Random();

	public static final Item createItem() {

		final String[] value = Item.ITEMS[random.nextInt(Item.ITEMS.length)];

		final Item item = new Item();
		item.setName(value[0]);
		item.setDescription(value[1]);

		item.setType(Item.TYPES[random.nextInt(Item.TYPES.length)]);
		item.setWeigth(random.nextInt(10));

		return item;
	}

}
