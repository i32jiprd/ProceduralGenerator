package entities;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Monster extends Entity {

	public static String[] MONSTERNAMES = new String[] {

			"Goblin Rookie", "Gun Giant", "Wight Ride", "Goblin Mage", "Gigamouth", "Goblin Guard", "Goblin Abyss",
			"Gurugon", "Baz Giant", "Poisoned Dead", "Living Corpse", "Apititer", "Goblin Knight", "Goblin Sage",
			"Giga Bazooka", "Steam Goblin", "Morgul", "Goblin Nemesis", "Mon-Grosser", "Maxima Bazooka",
			"Duster Goblin", "Zombion", "Deepone", "Goblin General" };

	public Monster() {
	}

	/**********************************/

	private static final Random random = new Random();
	private static final List<EntityType> ENTITYTYPES = Arrays.asList(EntityType.values());

	public static Monster createMonster() {
		final Monster monster = new Monster();

		monster.setName(Monster.MONSTERNAMES[random.nextInt(Monster.MONSTERNAMES.length)]);
		monster.setType(ENTITYTYPES.get(random.nextInt(ENTITYTYPES.size())));
		monster.setLevel(random.nextInt(99) + 1);

		monster.setStr(random.nextInt(99) + 1);
		monster.setDex(random.nextInt(99) + 1);
		monster.setCon(random.nextInt(99) + 1);
		monster.setMag(random.nextInt(99) + 1);

		monster.setMaxVitality((random.nextInt(9) + 1) * monster.getLevel());
		monster.setCurrentVitality(monster.getMaxVitality());

		monster.setMaxMana((random.nextInt(9) + 1) * monster.getLevel());
		monster.setCurrentMana(monster.getMaxMana());

		monster.setResfis(random.nextInt(9) + 1);
		monster.setResmag(random.nextInt(9) + 1);

		monster.setGold(random.nextInt(10 * monster.getLevel()));
		
		monster.getItems().add(Item.createItem());
		// monster.setItems(items);

		return monster;
	}

}
