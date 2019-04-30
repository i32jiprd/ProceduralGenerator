package entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Dungeon {

	public enum DungeonType {
		FIELD, DESERT, TUNDRA, BEACH, CAVERN, JUNGLE, MOUNTAIN, RUINS, DUNGEON
	};

	public static String[] NAMEPARTA = new String[] { "Bursting", "Hidden", "Expansive", "Boundless", "Closed",
			",Quiet", "Plenteous", "Collapsed", "Cursed", "Buried", "Lonely", "Great", "Chosen", "Discovered",
			",Indiscreet", "Putrid", "Hideous", "Soft", "Beautiful", "Raging", "Noisy", "Dog Dancing", ",Rejecting",
			"Sleepy", "Sinking", "Greedy", "Voluptuous", "Detestable", "Chronicling" };

	public static String[] NAMEPARTB = new String[] { "Passed Over", "Forbidden", "Haunted", "Corrupted", "Oblivious",
			"Eternal", "Smiling", "Momentary", "Pagan", "Hopeless", "Primitive", "Gluttonous", "Hot-Blooded",
			"Destroyer's", "Solitary", "Someone's", "Her", "Law's", "Talisman", "Orange", "Organ Market", "Agonizing",
			"Geothermal", "Golden", "Passionate" };

	public static String[] NAMEPARTC = new String[] { "Aqua Field", "Holy Ground", "Sea of Sand", "Fort Walls",
			"Twin Hills", "White Devil", "Hypha", "Spiral", "Paradise", "Fiery Sands", "Great Seal", "Fertile Land",
			"Nothingness", "Melody", "Remnant", "March", "Touchstone", "Sunny Demon", "Messenger", "Scent", "New Truth",
			"Pilgrimage", "Scaffold", "Far Thunder", "Tri Pansy", "Treasure Gem" };

	/***********************************/

	private String namePartA;
	private String namePartB;
	private String namePartC;
	private int level;
	private int size;
	private DungeonType type;
	private long gold;
	private List<Item> items = new ArrayList<>();
	private Entity boss;

	public Dungeon() {
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
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

	public Entity getBoss() {
		return boss;
	}

	public void setBoss(Entity boss) {
		this.boss = boss;
	}

	public String getNamePartA() {
		return namePartA;
	}

	public void setNamePartA(String namePartA) {
		this.namePartA = namePartA;
	}

	public String getNamePartB() {
		return namePartB;
	}

	public void setNamePartB(String namePartB) {
		this.namePartB = namePartB;
	}

	public String getNamePartC() {
		return namePartC;
	}

	public void setNamePartC(String namePartC) {
		this.namePartC = namePartC;
	}

	public DungeonType getType() {
		return type;
	}

	public void setType(DungeonType type) {
		this.type = type;
	}

	public String getName() {
		return namePartA + " " + namePartB + " " + namePartC;
	}

	public String toString() {
		final StringBuilder stringBuilder = new StringBuilder("\\nName: " + getName());
		stringBuilder.append("\n Level: " + getLevel());
		stringBuilder.append("\n Size: " + getSize());
		stringBuilder.append("\n Type: " + getType());
		stringBuilder.append("\n Gold: " + getGold());
		stringBuilder.append("\n Boss: " + getBoss());
		stringBuilder.append("\n Items: " + getItems());
		return stringBuilder.toString();
	}

	/*****************************************/

	private static final Random random = new Random();
	private static final List<DungeonType> DUNGEONTYPES = Arrays.asList(DungeonType.values());

	public static final Dungeon createDungeon() {

		final Dungeon dungeon = new Dungeon();
		dungeon.setNamePartA(Dungeon.NAMEPARTA[random.nextInt(Dungeon.NAMEPARTA.length)]);
		dungeon.setNamePartB(Dungeon.NAMEPARTB[random.nextInt(Dungeon.NAMEPARTB.length)]);
		dungeon.setNamePartC(Dungeon.NAMEPARTC[random.nextInt(Dungeon.NAMEPARTC.length)]);

		dungeon.setLevel(random.nextInt(99) + 1);
		dungeon.setSize(random.nextInt(9) + 1);
		dungeon.setType(DUNGEONTYPES.get(random.nextInt(DUNGEONTYPES.size())));

		dungeon.setGold(random.nextInt(100 * dungeon.getLevel()) * dungeon.getSize());

		dungeon.setBoss(Monster.createMonster());

		dungeon.getItems().add(Item.createItem());

		return dungeon;
	}

}
