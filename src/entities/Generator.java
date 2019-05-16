package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import entities.dungeon.Dungeon;
import entities.dungeon.Dungeon.DungeonType;

public class Generator {

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

		
		// generateMonsters();
		 generateItems();
		// System.out.println(Generator.createDungeon());

		// System.out.println("Total: " + namePartA.length * namePartB.length *
		// namePartC.length); // 18850
	}

}
