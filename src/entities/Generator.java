package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import entities.Dungeon.DungeonType;

public class Generator {

	private static Random random = new Random();

	public static List<Dungeon> generateDungeons() {
		final List<Dungeon> dungeons = new ArrayList<>();
		for (int i = 0; i < Dungeon.NAMEPARTA.length; i++) {
			for (int j = 0; j < Dungeon.NAMEPARTB.length; j++) {
				for (int k = 0; k < Dungeon.NAMEPARTC.length; k++) {
					final Dungeon dungeon = Dungeon.createDungeon();
					dungeons.add(dungeon);
					System.out.println(i + "," + j + "," + k + " " + dungeon);
				}
			}
		}

		System.out.println("Total dungeons: " + dungeons.size());

		final int[] levels = new int[10];
		long totalGold = 0;

		final Map<DungeonType, Integer> types = new HashMap<>();

		for (final Dungeon dungeon : dungeons) {

			totalGold += dungeon.getGold();

			final DungeonType key = dungeon.getType();
			final Integer value = types.get(key);
			if (value == null) {
				types.put(key, 1);
			} else {
				types.put(key, value + 1);
			}

			int level = dungeon.getLevel();
			if (level <= 10) {
				levels[0]++;
			} else if (level <= 20) {
				levels[1]++;
			} else if (level <= 30) {
				levels[2]++;
			} else if (level <= 40) {
				levels[3]++;
			} else if (level <= 50) {
				levels[4]++;
			} else if (level <= 60) {
				levels[5]++;
			} else if (level <= 70) {
				levels[6]++;
			} else if (level <= 80) {
				levels[7]++;
			} else if (level <= 90) {
				levels[8]++;
			} else {
				levels[9]++;
			}
		}

		for (int i = 0; i < levels.length; i++) {
			System.out.println("Level[" + (i * 10) + "]: " + levels[i]);
		}
		System.out.println("Gold--> " + totalGold);

		System.out.println(types);
		return dungeons;
	}

	public static List<Monster> generateMonsters() {
		final List<Monster> monsters = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			final Monster monster = Monster.createMonster();
			monsters.add(monster);
			System.out.println(i + " " + monster);
		}

		System.out.println("Total monsters: " + monsters.size());
		return monsters;
	}

	public static List<Item> generateItems() {
		final List<Item> items = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			final Item item = Item.createItem();
			items.add(item);
			System.out.println(i + " " + item);
		}

		System.out.println("Total items: " + items.size());
		return items;
	}
	
	public static void main(String[] args) {

		//generateDungeons();
		// generateMonsters();
		 generateItems();
		// System.out.println(Generator.createDungeon());

		// System.out.println("Total: " + namePartA.length * namePartB.length *
		// namePartC.length); // 18850
	}

}
